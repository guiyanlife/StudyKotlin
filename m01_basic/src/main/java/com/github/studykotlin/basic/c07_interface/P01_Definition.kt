package com.github.studykotlin.basic.c07_interface

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 接口定义
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
interface MyInterface {  // 使用interface关键字定义接口
    var name: String  // 接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时必须重写属性

    /**
     * 未实现的方法
     */
    fun bar()

    /**
     * 也允许方法有默认实现
     */
    fun foo() {
        println("foo")
    }
}

class Child : MyInterface {  // 一个类或者对象可以实现一个或多个接口
    override var name: String = "Google"  // 重写属性
    override fun bar() {
        println("bar")
    }
}

fun main(args: Array<String>) {
    val c = Child()
    c.foo()
    c.bar()
    println(c.name)
}