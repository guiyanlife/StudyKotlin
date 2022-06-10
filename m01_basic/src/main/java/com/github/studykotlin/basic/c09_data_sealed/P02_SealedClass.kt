package com.github.studykotlin.basic.c09_data_sealed

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 密封类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
sealed class SealedClass
data class Const(val number: Double) : SealedClass()
data class Sum(val e1: SealedClass, val e2: SealedClass) : SealedClass()
object NotANumber : SealedClass()

fun eval(expr: SealedClass): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN  // 不再需要else子句，因为已经覆盖了所有的情况
}

fun main(args: Array<String>) {
    println(eval(Const(123.5)))
    println(eval(Sum(Const(99.0), Const(0.88))))
    println(eval(NotANumber))
}