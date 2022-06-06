package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 类型转换
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型
    val b: Byte = 1  // OK, 字面值是静态检测的
//    val i: Int = b  // 错误
    val i: Int = b.toInt()  // OK

    // 每种数据类型都有下面的这些方法，可以转化为其它的类型
    val byte: Byte = b.toByte()
    val short: Short = b.toShort()
    val int: Int = b.toInt()
    val long: Long = b.toLong()
    val float: Float = b.toFloat()
    val double: Double = b.toDouble()
    val char: Char = i.toChar()

    // 自动类型转化
    val l = 1L + 3  // Long + Int => Long
}