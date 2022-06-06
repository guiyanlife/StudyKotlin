package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 字符
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Character {
    /**
     * Char不能直接和数字操作，Char必需是单引号'包含起来的。比如普通字符'0'、'a'
     */
    fun check(c: Char) {
//        if (c == 1) {  // 错误：类型不兼容
//        }
    }

    /**
     * 字符字面值用单引号括起来：'1'。特殊字符可以用反斜杠转义
     * 支持的转义序列：\t、\b、\n、\r、\'、\"、\\和\$。编码其他字符要用Unicode转义序列语法：'\uFF00'
     */
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt()  // 可以显式把Char转换为Int数字
    }
}

fun main(args: Array<String>) {
    println(Character().decimalDigitValue('8'))
}