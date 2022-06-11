package com.github.studykotlin.basic.c10_generics

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 星号投射
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class StarProjection<T>(val t: T, val t2: T, val t3: T)
class Apple(var name: String)

fun main(args: Array<String>) {
    // 使用类。当不知道泛型参数的类型信息，但仍需要安全的使用它时，可以使用星投影，用星号*表示
    val a1: StarProjection<*> = StarProjection(12, "String", Apple("苹果"))     // *代指了所有类型，相当于Any?
    val a2: StarProjection<Any?> = StarProjection(12, "String", Apple("苹果"))  // 和a1是一样的
    val apple = a1.t3  // 参数类型为Any
    println(apple)
    val apple2 = apple as Apple  // 强转成Apple类
    println(apple2.name)

    // 使用数组
    val l: ArrayList<*> = arrayListOf("String", 1, 1.2f, Apple("苹果"))
    for (item in l) {
        println(item)
    }
}