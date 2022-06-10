package com.github.studykotlin.basic.c09_data_sealed

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 数据类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
data class DataClass(val name: String, val age: Int)  // Kotlin可以创建一个只包含数据的类，关键字为data

fun main(args: Array<String>) {
    // 编译器会自动的从主构造函数中根据所有声明的属性提取以下函数
    val jack = DataClass(name = "Jack", age = 1)
    println(jack.equals(null))
    println(jack.hashCode())
    println(jack.toString())
    println(jack.component1())   // 对应于属性，按声明顺序排列
    println(jack.component2())
    println(jack.copy(age = 2))  // 可以使用复制函数复制对象并修改部分属性

    // 组件函数允许数据类在解构声明中使用
    val jane = DataClass("Jane", 35)
    val (name, age) = jane  // 解构
    println("$name, $age years of age")  // 输出：Jane, 35 years of age

    // 标准库提供了Pair和Triple。在大多数情形中，命名数据类是更好的设计选择，因为这样代码可读性更强而且提供了有意义的名字和属性
    println(Pair("Frank", 30))
    println(Triple("Frank", 30, "male"))
}