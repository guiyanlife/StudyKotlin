package com.github.studykotlin.basic.c10_generics

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 泛型约束
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun <T : Comparable<T>> sort(list: List<T>): List<T> {  // 对泛型的类型上限进行约束。默认的上界是Any?
    return list.sorted()
}

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String> where T : CharSequence, T : Comparable<T> {  // 多个上界约束条件用where子句
    return list.filter { it > threshold }.map { it.toString() }
}

fun main(args: Array<String>) {
    sort(listOf(1, 2, 3))  // 正确。Int是Comparable<Int>的子类型
//    sort(listOf(HashMap<Int, String>()))  // 错误。HashMap<Int, String>不是Comparable<HashMap<Int, String>>的子类型
    println(copyWhenGreater(listOf("100", "200", "300"), "150"))
}