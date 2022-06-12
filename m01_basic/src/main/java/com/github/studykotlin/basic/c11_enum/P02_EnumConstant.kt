package com.github.studykotlin.basic.c11_enum

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 枚举常量
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
enum class Color2 {
    RED, BLACK, BLUE, GREEN, WHITE
}

inline fun <reified T : Enum<T>> printAllValues() {
    /**
     * 使用enumValues<T>()和enumValueOf<T>()函数，以泛型的方式访问枚举类中的常量
     */
    print(enumValues<T>().joinToString { it.name })
}

fun main(args: Array<String>) {
    // 枚举类具有合成方法，允许遍历定义的枚举常量并通过其名称获取枚举常数
    var color: Color2 = Color2.BLUE
    println(Color2.values())  // 以数组的形式，返回枚举值
    println(Color2.valueOf("RED"))  // 转换指定name为枚举值，若未匹配成功，会抛出IllegalArgumentException
    println(color.name)     // 获取枚举名称
    println(color.ordinal)  // 获取枚举值在所有枚举数组中定义的顺序

    // 以泛型的方式访问枚举类中的常量
    printAllValues<Color2>()  // 输出RED, GREEN, BLUE
}