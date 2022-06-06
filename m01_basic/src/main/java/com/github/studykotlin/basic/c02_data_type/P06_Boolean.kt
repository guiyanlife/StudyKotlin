package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 布尔
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 布尔用Boolean类型表示，它有两个值：true和false。若需要可空引用布尔会被装箱。
    val right: Boolean = true
    println(right || false)  // 短路逻辑或
    println(right && false)  // 短路逻辑与
    println(!right)          // 逻辑非
}