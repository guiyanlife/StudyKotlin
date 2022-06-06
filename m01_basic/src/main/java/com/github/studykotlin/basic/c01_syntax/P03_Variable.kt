package com.github.studykotlin.basic.c01_syntax

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 定义常量与变量
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    val a: Int = 1  // 不可变变量定义：val 关键字
    val b = 1       // 系统自动推断变量类型为Int
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值

    var x = 5        // 可变变量定义：var 关键字
    x += 1           // 变量可修改
}