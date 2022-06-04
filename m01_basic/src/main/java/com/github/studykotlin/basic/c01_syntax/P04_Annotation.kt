package com.github.studykotlin.basic.c01_syntax

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 注释
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Annotation {
    /* 这是一个多行的
    块注释
    */
    fun sum(a: Int, b: Int): Int {  // 这是一个单行注释
        return a + b
    }
}

fun main() {
    println(Annotation().sum(2, 30))
}