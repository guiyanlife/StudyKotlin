package com.github.studykotlin.basic.c10_generics

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 泛型
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Box<T>(t: T) {  // 泛型，即参数化类型，将类型参数化，可以用在类、接口、方法上
    var value = t
}

fun <T> doPrintln(content: T) {  // Kotlin泛型函数的声明与Java相同，类型参数要放在函数名的前面
    when (content) {
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        else -> println("T 不是整型，也不是字符串")
    }
}

fun main(args: Array<String>) {
    // 定义泛型类型变量
    var boxString = Box<String>("Google")  // 完整写明类型参数
    var boxInt = Box(10)   // 如果编译器可以自动推定类型参数，也可以省略类型参数
    println(boxString.value)  // 向泛型类Box传入字符串
    println(boxInt.value)     // 向泛型类Box传入整型数据

    // 调用泛型函数时，如果可以推断出类型参数，可以省略泛型参数
    doPrintln<Int>(35)
    doPrintln("Franklin")
    doPrintln(true)
}