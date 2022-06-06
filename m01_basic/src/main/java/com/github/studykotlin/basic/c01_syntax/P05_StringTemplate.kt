package com.github.studykotlin.basic.c01_syntax

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 字符串模版
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    var a = 1
    val s1 = "a is $a"  // $varName表示变量值
    println(s1)
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"  // ${varName.fun()}表示变量的方法返回值
    println(s2)
}