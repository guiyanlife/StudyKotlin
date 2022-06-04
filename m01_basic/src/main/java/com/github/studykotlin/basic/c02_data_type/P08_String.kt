package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 字符串
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // String是不可变的，Kotlin支持三个引号"""扩起来的字符串，支持多行字符串
    val text = """
    |多行字符串
    |谷歌
    |多行字符串
    |Google
    """
    println(text)

    // String可以通过trimMargin()方法来删除多余的空白，默认|用作边界前缀
    val textTrimMargin = text.trimMargin()
    println(textTrimMargin)

    // 方括号[]语法可以很方便的获取String中的某个字符，也可以通过for循环遍历
    for (c in textTrimMargin) {
        println(c)
    }
}