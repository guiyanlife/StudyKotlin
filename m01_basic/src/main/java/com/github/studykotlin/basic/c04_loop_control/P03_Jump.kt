package com.github.studykotlin.basic.c04_loop_control

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 返回和跳转
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Jump {
    /**
     * return表达式从最直接包围它的函数即foo中返回
     */
    fun foo() {
        (0..10).forEach {
            if (it == 2) return
            println(it)
        }
    }

    /**
     * 标签限制的return从lambda表达式中返回
     */
    fun foo1() {
        (0..10).forEach lit@{
            if (it == 5) return@lit
            println(it)
        }
    }

    /**
     * 使用隐式标签从lambda表达式中返回
     */
    fun foo2() {
        (0..10).forEach {
            if (it == 6) return@forEach
            println(it)
        }
    }

    /**
     * 用一个匿名函数替代lambda表达式。匿名函数内部的return语句将从该匿名函数自身返回
     */
    fun foo3() {
        (0..10).forEach(fun(value: Int) {
            if (value == 7) return
            println(value)
        })
    }
}

fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i == 3) continue  // continue表示继续下一次最直接包围它的循环。i为3时跳过当前循环，继续下一次循环
        println(i)
        if (i > 5) break  // break表示终止最直接包围它的循环。i为6时跳出循环
    }

    // 任何表达式都可以用标签label来标记。标签的格式为标识符后跟@符号，要为一个表达式加标签，只要在其前加标签即可
    loop@ for (i in 1..100) {
        println("i is $i")
        for (j in 1..100) {
            if (j == 50) break@loop  // 标签限制的break跳转到位于该标签指定的循环后面的执行点
        }
    }

    // 标签限制的return允许从外层函数返回。最重要的一个用途就是从lambda表达式中返回
    val jump = Jump()
    jump.foo()
    jump.foo1()
    jump.foo2()
    jump.foo3()
}