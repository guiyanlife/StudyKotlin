package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 字符串模板
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 字符串可以包含模板表达式，可以求值并把结果合并到字符串中。模板表达式以美元符$开头，由一个简单的名字构成
    val i = 10
    val s = "i = $i"  // 求值结果为"i = 10"
    println(s)

    // 或者用花括号扩起来的任意表达式
    val name = "Google"
    val str = "$name.length is ${name.length}"  // 求值结果为 "Google.length is 6"
    println(str)

    // 原生字符串和转义字符串内部都支持模板
    val price = "${'$'}9.99"  // 在原生字符串中表示字面值$字符
    println(price)  // 求值结果为$9.99
}