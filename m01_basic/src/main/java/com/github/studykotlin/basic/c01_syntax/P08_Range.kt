package com.github.studykotlin.basic.c01_syntax

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 区间
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 区间表达式由具有操作符形式..的rangeTo函数辅以in和!in形成
    print("循环输出：")
    for (i in 1..4) print(i)  // 输出1234
    println("\n----------------")
    print("使用step设置步长：")
    for (i in 1..4 step 2) print(i)  // 输出13
    println("\n----------------")
    print("使用downTo并设置步长：")
    for (i in 4 downTo 1 step 2) print(i)  // 输出42
    println("\n----------------")
    for (i in 4..1) print(i)  // 什么都不输出
    print("使用until函数排除结束元素：")
    for (i in 1 until 4) {  // i的范围是[1, 4)，排除了4
        print(i)
    }
    println("\n----------------")
}