package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 内部类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class OuterClass {
    private val bar: Int = 1
    var v = "成员属性"

    /**
     * 嵌套内部类。内部类会带有一个对外部类的对象的引用，所以内部类可以访问外部类成员属性和成员函数
     */
    inner class Inner {  // 内部类使用inner关键字来表示
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@OuterClass  // 获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}

fun main(args: Array<String>) {
    val demo = OuterClass().Inner().foo()
    println(demo)  // 1
    OuterClass().Inner().innerTest()  // 内部类可以引用外部类的成员，例如：成员属性
}