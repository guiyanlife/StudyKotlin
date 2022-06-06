package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 类定义
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Definition {  // 类名为Definition
    // 大括号内是类体构成
    fun foo() {  // 成员函数
        println("Foo")
    }
}

class Empty  // 也可以定义一个空类

fun main(args: Array<String>) {
    Definition().foo()
    println(Empty())
}