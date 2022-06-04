package com.github.studykotlin.basic.c03_conditional_control

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: When表达式
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class When {
    /**
     * 检测一个值是(is)或者不是(!is)一个特定类型的值
     */
    fun hasPrefix(x: Any) = when (x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
}

fun main() {
    // when将它的参数和所有的分支条件顺序比较，直到某个分支满足条件
    var x = 0
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x 不是 1 ，也不是 2")
        }
    }

    // else同switch的default。如果其他分支都不满足条件将会求值else分支
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    // 检测一个值在(in)或者不在(!in)一个区间或者集合中
    when (x) {
        in 1..10 -> println("x is in the range")
        in -10..-5 -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    // 检测一个值是(is)或者不是(!is)一个特定类型的值
    println(When().hasPrefix(x))

    // when也可以用来取代if-else if链。如果不提供参数，所有的分支条件都是简单的布尔表达式，而当一个分支的条件为真时则执行该分支
    when {
        x % 2 == 0 -> println("x is odd")
        x % 2 != 0 -> println("x is even")
        else -> println("x is funny")
    }

    // when中使用in运算符来判断集合内是否包含某实例
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}