package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 次构造函数
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class SecConstructor constructor(name: String) {  // 类名为SecConstructor
    // 大括号内是类体构成
    var url: String = "http://www.google.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名: ${name}")
    }

    /**
     * 次构造函数
     */
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

class DontCreateMe private constructor() {  // 类的构造函数私有化
}

class Customer(val customerName: String = "default")  // 主构造函数的参数带有默认值的情况

fun main(args: Array<String>) {
    val secConstructor = SecConstructor("谷歌", 10000)
    println(secConstructor.siteName)
    println(secConstructor.url)
    println(secConstructor.country)
    secConstructor.printTest()
    println(Customer().customerName)
}