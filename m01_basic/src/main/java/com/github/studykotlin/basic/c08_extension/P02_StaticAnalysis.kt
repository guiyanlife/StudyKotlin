package com.github.studykotlin.basic.c08_extension

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 扩展函数是静态解析的
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
open class C
class D : C()

fun C.foo() = "c"  // 扩展函数foo
fun D.foo() = "d"  // 扩展函数foo
fun printFoo(c: C) {
    println(c.foo())  // 扩展函数是静态解析的，并不是接收者类型的虚拟成员。类型是C类
}

class E {
    fun foo() {
        println("成员函数")
    }
}

fun E.foo() {
    println("扩展函数")
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()  // 空检测之后，this会自动转换为非空类型，所以toString()解析为Any类的成员函数
}

class People(var firstName: String, var lastName: String)

var People.fullName: String  // 扩展属性允许定义在类或者kotlin文件中，不允许定义在函数中
    get() {  // 初始化属性因为属性没有后端字段(field)，所以不允许被初始化，只能由显式提供的getter/setter定义
        return "名字是：${firstName}.${lastName}"
    }
    set(value) {
        if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
            println("您输入的fullName不合法")
        } else {
            val names = value.split(".")
            firstName = names[0]
            lastName = names[1]
        }
    }

fun main(arg: Array<String>) {
    // 在调用扩展函数时，具体被调用的是哪一个函数，由调用函数的对象表达式来决定的，而不是动态的类型决定的
    printFoo(D())

    // 若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数
    var e = E()
    e.foo()

    // 在扩展函数内，可以通过this来判断接收者是否为NULL，这样即使接收者为NULL，也可以调用扩展函数
    var t = null
    println(t.toString())

    // Kotlin支持属性对属性进行扩展
    val people = People("Li", "Hong")
    println(people.fullName)
    people.fullName = "Wang.Qiang"
    println(people.fullName)
}