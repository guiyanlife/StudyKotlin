package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 位操作符
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main() {
    // 对于Int和Long类型，还有位操作符可以使用
    val two: Int = 2
    println(two.shl(1))   // 左移位(Java’s <<)
    println(two.shr(1))   // 右移位(Java’s >>)
    println(two.ushr(1))  // 无符号右移位(Java’s >>>)
    println(two.and(1))  // 与
    println(two.or(1))   // 或
    println(two.xor(3))  // 异或
    println(two.inv())  // 反向
}