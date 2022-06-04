package com.github.studykotlin.basic.c04_loop_control

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: while与do...while循环
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // while是最基本的循环，如果不满足条件，则不能进入循环
    println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println(x--)
    }

    // do…while循环和while循环相似，不同的是，do…while循环至少会执行一次
    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while (y > 0)
}