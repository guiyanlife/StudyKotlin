package com.github.studykotlin.basic.c06_inheritance

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 属性重写
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class PropertyOverride : Foo() {
    // 属性重写使用override关键字，属性必须具有兼容类型，每一个声明的属性都可以通过初始化程序或者getter方法被重写
    override val x: Int = 10
}

open class Foo {
    open val x: Int
        get() {
            return 20
        }
}

// 可以在主构造函数中使用override关键字作为属性声明的一部分
class Bar1(override val count: Int) : Foo1
class Bar2 : Foo1 {
    override var count: Int = 0
}

interface Foo1 {
    val count: Int
}

fun main(args: Array<String>) {
    println(PropertyOverride().x)
    println(Bar1(666).count)
    println(Bar2().count)
}