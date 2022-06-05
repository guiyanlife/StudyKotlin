package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 主构造器
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class MainConstructor constructor(name: String, val firstName: String) {  // 可以通过主构造器来定义（var或val）属性并初始化属性值
    // 大括号内是类体构成
    var url: String = "http://www.google.com"
    var country: String = "CN"
    var siteName = name  // 通过主构造器的形参，初始化siteName

    /**
     * 主构造器中不能包含任何代码，初始化代码可以放在初始化代码段中，初始化代码段使用init关键字作为前缀
     */
    init {
        println("初始化网站名: ${name}")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

fun main(args: Array<String>) {
    val mainConstructor = MainConstructor("主构造器", "Frank")
    println(mainConstructor.siteName)
    println(mainConstructor.url)
    println(mainConstructor.country)
    println(mainConstructor.firstName)
    mainConstructor.printTest()
}