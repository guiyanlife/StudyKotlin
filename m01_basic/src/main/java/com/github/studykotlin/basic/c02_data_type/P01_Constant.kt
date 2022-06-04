package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 字面常量
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main() {
    // 基本数值类型包括Byte、Short、Int、Long、Float、Double等。不同于Java的是，字符不属于数值类型，是一个独立的数据类型
    // Byte类型，占8bit（1字节）
    val byte: Byte = 127
    val hexByte: Byte = 0xFF.toByte() // 16进制以0x开头
    val binByte: Byte = 0b00001011.toByte() // 2进制以0b开头

    // Short类型，占16bit（2字节）
    val short: Short = 32767

    // Int类型，占32bit（4字节）
    val int: Int = 123456123
    val oneMillion: Int = 1_000_000  // 用下划线方式表示数字常量

    // Long类型，占64bit（8字节）
    val long: Long = 123L  // 长整型以大写的L结尾
    val creditCardNumber: Long = 1234_5678_9012_3456L  // 用下划线方式表示数字常量
    val socialSecurityNumber: Long = 999_99_9999L
    val hexBytes: Long = 0xFF_EC_DE_5EL
    val bytes: Long = 0b11010010_01101001_10010100_10010010L

    // Float类型，占32bit（4字节）
    val float: Float = 123.6f  // Float使用f或者F后缀
    val floatOneMillion: Float = 1_000_000f  // 用下划线方式表示数字常量

    // Double类型，占64bit（8字节）
    val double: Double = 123.5  // Double小数后面不加后缀
    val science: Double = 123.5e10  // 科学记数法表示
}