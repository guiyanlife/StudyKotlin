package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 数组
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 数组的创建
    val a = arrayOf(1, 2, 3)  // 使用函数arrayOf()创建数组[1, 2, 3]
    val b = Array(3, { i -> (i * 2) })  // 使用工厂函数创建数组[0, 2, 4]

    // 读取数组内容
    println(a[0])    // []运算符代表调用Array成员函数get()，输出结果：1
    println(b[1])    // 输出结果：2
    println(a.size)  // 数组的长度size属性，输出结果：3

    // Kotlin中数组是不协变的，除了类Array，还有ByteArray、ShortArray、IntArray用来表示各类型数组，省去装箱操作，效率更高
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]  // []运算符代表调用Array成员函数get()和set()
}