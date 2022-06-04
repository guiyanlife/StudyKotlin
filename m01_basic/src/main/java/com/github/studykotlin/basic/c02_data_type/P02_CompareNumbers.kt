package com.github.studykotlin.basic.c02_data_type

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 比较两个数字
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 三个等号===表示比较对象地址，两个等号==表示比较两个值大小
    val a: Int = 10000  // Kotlin中没有基础数据类型，只有封装的数字类型，每定义的一个变量，其实是Kotlin封装了一个对象
    println(a === a)    // true，值相等，对象地址相等

    // 经过了装箱，创建了两个不同的对象，但是值是相等的，都是10000
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)  // false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA)   // true，值相等
}