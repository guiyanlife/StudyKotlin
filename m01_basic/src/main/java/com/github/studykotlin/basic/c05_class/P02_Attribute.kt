package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 类的属性
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Attribute {
    // 类的属性可以用关键字var声明为可变的，否则使用只读关键字val声明为不可变
    var name: String = "Franklin"
    var url: String = "www.baidu.com"
    val city: String = "Beijing"

    // 修改getter方法
    var lastName: String = "zhang"
        get() = field.toUpperCase()  // 将变量赋值后转换为大写
        set

    // 修改setter方法
    var no: Int = 100
        get() = field  // 后端变量
        set(value) {
            if (value < 10) {  // 如果传入的值小于10返回该值
                field = value
            } else {
                field = -1  // 如果传入的值大于等于10返回-1
            }
        }
    var height: Float = 145.4f
        private set  // 私有化setter函数，height属性为只读

    // 非空属性必须在定义的时候初始化，kotlin提供了一种可以延迟初始化的方案，使用lateinit关键字描述属性
    lateinit var subject: String
}

fun main(args: Array<String>) {
    // 使用普通函数那样使用构造函数创建类实例
    var person: Attribute = Attribute()

    // 使用一个属性，只要用名称引用它即可
    person.lastName = "wang"
    println("lastName: ${person.lastName}")
    person.no = 9
    println("no: ${person.no}")
    person.no = 20
    println("no: ${person.no}")
    person.subject = "study"
    println("subject: ${person.subject}")
}