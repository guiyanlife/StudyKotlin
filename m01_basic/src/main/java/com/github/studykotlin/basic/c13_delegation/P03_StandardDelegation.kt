package com.github.studykotlin.basic.c13_delegation

import kotlin.properties.Delegates

/**
 * Copyright (c) 2024 GitHub, Inc.
 * Description: 标准委托
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
val lazyValue: String by lazy {  // lazy()是一个函数，接受一个Lambda表达式作为参数，返回一个Lazy<T>实例的函数，返回的实例可以作为实现延迟属性的委托
    println("computed!")  // 第一次调用输出，第二次调用不执行
    "Hello"
}

class User {
    // observable可以用于实现观察者模式
    var name: String by Delegates.observable("初始值") {  // Delegates.observable()函数接受两个参数：第一个是初始化值，第二个是属性值变化事件的响应器(handler)
            prop, old, new ->  // 在属性赋值后会执行事件的响应器(handler)，它有三个参数：被赋值的属性、旧值和新值
        println("旧值：$old -> 新值：$new")
    }
}

class Site(val map: Map<String, Any?>) {  // 在一个映射map里存储属性的值。这经常出现在像解析JSON或者做其他“动态”事情的应用中
    val name: String by map  // 使用映射实例自身作为委托来实现委托属性
    val url: String by map
}

class Site1(val map: MutableMap<String, Any?>) {
    val name: String by map
    val url: String by map
}

class Foo {
    var notNullBar: String by Delegates.notNull<String>()  // notNull适用于那些无法在初始化阶段就确定属性值的场合
}

fun example(computeFoo: () -> Foo) {  // 你可以将局部变量声明为委托属性
    val memoizedFoo by lazy(computeFoo)  // 使一个局部变量惰性初始化
    println(memoizedFoo.notNullBar)
    println(memoizedFoo.notNullBar)
}

fun main(args: Array<String>) {  // Kotlin的标准库中已经内置了很多工厂方法来实现属性的委托
    // 延迟属性Lazy
    println(lazyValue)  // 第一次执行，执行两次输出表达式。第一次调用get()会执行已传递给lazy()的lambda表达式并记录结果
    println(lazyValue)  // 第二次执行，只输出返回值。后续调用get()只是返回记录的结果

    // 可观察属性Observable
    val user = User()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
    // 把属性储存在映射中
    val site = Site(
        mapOf(  // 构造函数接受一个映射参数
            "name" to "Google",
            "url" to "www.google.com"
        )
    )
    println(site.name)  // 读取映射值
    println(site.url)
    var map: MutableMap<String, Any?> = mutableMapOf(  // 如果使用var属性，需要把Map换成MutableMap
        "name" to "Baidu",
        "url" to "www.baidu.com"
    )
    val site1 = Site1(map)
    println(site1.name)
    println(site1.url)
    println("--------------")
    map.put("name", "Sina")
    map.put("url", "www.sina.com.cn")
    println(site1.name)
    println(site1.url)

    // Not Null
    val foo = Foo()
    foo.notNullBar = "bar"  // 需要注意，如果属性在赋值前就被访问的话则会抛出异常
    println(foo.notNullBar)

    // 局部委托属性
    example {
        println("computed!")  // 第一次调用输出，第二次调用不执行
        Foo().apply { notNullBar = "Hello" }
    }
}