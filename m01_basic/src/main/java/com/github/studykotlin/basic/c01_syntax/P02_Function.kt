package com.github.studykotlin.basic.c01_syntax

import kotlin.math.PI
import kotlin.math.sin

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 函数定义
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Function {
    /**
     * 函数定义使用关键字fun，参数格式为：参数: 类型
     */
    fun sum(a: Int, b: Int): Int {  // Int参数，返回值Int
        return a + b
    }

    /**
     * 表达式作为函数体，返回类型自动推断
     */
    fun mul(a: Int, b: Int) = a * b
    public fun sub(a: Int, b: Int): Int = a - b  // public方法则必须明确写出返回类型

    /**
     * 无返回值的函数
     */
    fun printSum(a: Int, b: Int): Unit {
        print(a + b)
    }

    public fun printSub(a: Int, b: Int) {  // 如果是返回Unit类型，则可以省略（对于public方法也是如此）
        print(a - b)
    }

    /**
     * 函数的变长参数可以用vararg关键字进行标识
     */
    fun printVars(vararg v: Int) {
        for (vt in v)
            print(vt)
    }

    /**
     * lambda（匿名函数）表达式使用
     */
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    val sinLambda: (Double) -> Double = { sin(it) }  // 若lambda表达式只有一个参数，则该参数可以使用it指代
}

fun main(args: Array<String>) {
    val func = Function()
    println("sum(9, 13): " + func.sum(9, 13))
    println("mul(10, 13): " + func.mul(10, 13))
    println("sub(9, 18): " + func.sub(9, 18))
    print("printSum(12, 3): "); func.printSum(12, 3); println()
    print("printSub(6, 12): "); func.printSub(6, 12); println()
    print("printVars(9,8,7,5,6,3,4,12): "); func.printVars(9, 8, 7, 5, 6, 3, 4, 12); println()
    println("sumLambda(2，7): " + func.sumLambda(2, 7))
    println("sinLambda(PI/6): " + func.sinLambda(PI / 6))
}