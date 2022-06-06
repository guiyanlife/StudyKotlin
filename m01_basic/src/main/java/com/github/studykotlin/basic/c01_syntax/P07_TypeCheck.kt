package com.github.studykotlin.basic.c01_syntax

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 类型检测及自动类型转换
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class TypeCheck {
    /**
     * 使用is运算符检测一个表达式是否是某类型的一个实例（类似于Java中的instanceof关键字）
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }
        // 这里还有一种方法，与Java中instanceof不同，使用!is
        if (obj !is String) {
            println("obj type is not string")
        }
        // 这里的obj仍然是Any类型的引用
        return null
    }

    fun getStringLength1(obj: Any): Int? {
        if (obj !is String)
            return null
        // 在这个分支中，obj的类型会被自动转换为String
        return obj.length
    }

    fun getStringLength2(obj: Any): Int? {
        // 在&&运算符的右侧，obj的类型会被自动转换为String
        if (obj is String && obj.length > 0)
            return obj.length
        return null
    }
}

fun main(args: Array<String>) {
    val typeCheck = TypeCheck()
    println(typeCheck.getStringLength("1024"))
    println(typeCheck.getStringLength(1024))
    println(typeCheck.getStringLength1("Hello"))
    println(typeCheck.getStringLength2("World"))
}