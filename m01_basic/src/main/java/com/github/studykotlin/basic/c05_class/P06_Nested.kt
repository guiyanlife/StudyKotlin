package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 嵌套类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Outer {  // 外部类
    private val bar: Int = 1

    /**
     * 嵌套类，把类嵌套在其他类中
     */
    class Nested {
        fun foo() = 2
    }
}

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo()  // 调用格式：外部类.嵌套类.嵌套类方法/属性
    println(demo)  // == 2
}