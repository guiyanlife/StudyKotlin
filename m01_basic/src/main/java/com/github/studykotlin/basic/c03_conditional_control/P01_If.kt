package com.github.studykotlin.basic.c03_conditional_control

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: if表达式
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main() {
    // 一个if语句包含一个布尔表达式和一条或多条语句
    val a = 20
    val b = 10
    var max: Int = a
    if (a < b) max = b  // 传统用法
    if (a > b) {  // 使用else
        max = a
    } else {
        max = b
    }
    max = if (a > b) a else b  // 作为表达式（类似Java三元操作符）

    // 也可以把if表达式的结果赋值给一个变量
    max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    // 实例
    var x = 0
    if (x > 0) {
        println("x 大于 0")
    } else if (x == 0) {
        println("x 等于 0")
    } else {
        println("x 小于 0")
    }
    val c = if (a >= b) a else b
    println("c 的值为 $c")
}