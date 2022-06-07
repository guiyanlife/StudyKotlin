package com.github.studykotlin.basic.c07_interface

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 函数重写
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
interface A {
    fun foo() {  // 已实现
        println("A foo")
    }

    fun bar()    // 未实现，没有方法体，是抽象的
}

interface B {
    fun foo() {  // 已实现
        println("B foo")
    }

    fun bar() {  // 已实现
        println("B bar")
    }
}

class C : A {
    override fun bar() {  // 重写
        println("C bar")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(args: Array<String>) {
    val d = D()
    d.foo()
    d.bar()
    C().bar()
}