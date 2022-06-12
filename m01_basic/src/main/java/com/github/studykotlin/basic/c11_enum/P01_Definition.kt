package com.github.studykotlin.basic.c11_enum

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 枚举类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
enum class Color {  // 枚举类最基本的用法是实现一个类型安全的枚举
    RED, BLACK, BLUE, GREEN, WHITE  // 枚举常量用逗号分隔，每个枚举常量都是一个对象
}

enum class Color1(val rgb: Int) {  // 枚举初始化
    RED(0xFF0000),  // 每一个枚举都是枚举类的实例，它们可以被初始化
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Shape(value: Int) {  // 默认名称为枚举字符名，值从0开始。若需要指定值，则可以使用其构造函数
    ovel(100),
    rectangle(200)
}

enum class ProtocolState {  // 枚举还支持以声明自己的匿名类及相应的方法，还有覆盖基类的方法
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main(args: Array<String>) {
    println(Color.RED)
    println(Color1.RED.rgb)
    println(Shape.ovel)
    println(ProtocolState.WAITING.signal())
}