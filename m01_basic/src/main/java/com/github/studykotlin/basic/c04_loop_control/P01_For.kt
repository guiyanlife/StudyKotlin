package com.github.studykotlin.basic.c04_loop_control

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: For循环
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main() {
    // for循环可以对任何提供迭代器(iterator)的对象进行遍历
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    // 通过索引遍历一个数组或者一个list
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    // 用库函数withIndex遍历索引与值
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}