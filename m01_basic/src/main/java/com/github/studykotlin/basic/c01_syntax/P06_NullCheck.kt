package com.github.studykotlin.basic.c01_syntax

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: NULL检查机制
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class NullCheck {
    /**
     * 当一个引用可能为null值时，对应的类型声明必须明确地标记为可为null
     * 当str中的字符串内容不是一个整数时，返回null
     */
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    /**
     * 在进行过null值检查之后，变量的类型会被自动转换为非null变量
     */
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        // 直接使用x*y会导致错误，因为它们可能为null
        if (x != null && y != null) {
            // 在进行过null值检查之后，x和y的类型会被自动转换为非null变量
            println(x * y)
        } else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }

    fun printProduct1(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        // 直接使用x*y会导致错误，因为它们可能为null
        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }
        // 在进行过null值检查之后，x和y的类型会被自动转换为非null变量
        println(x * y)
    }
}

fun main(args: Array<String>) {
    var age: String? = "23"   // 类型后面加?表示可为空
    val ages = age!!.toInt()  // age为空抛出空指针异常
    val ages1 = age?.toInt()  // age为空不做处理返回null
    val ages2 = age?.toInt() ?: -1  // age为空返回-1

    val nullCheck = NullCheck()
    nullCheck.printProduct("6", "7")
    nullCheck.printProduct("a", "7")
    nullCheck.printProduct("a", "b")
    nullCheck.printProduct1("7", "8")
}