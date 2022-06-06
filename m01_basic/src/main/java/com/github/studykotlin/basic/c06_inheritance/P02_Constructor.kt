package com.github.studykotlin.basic.c06_inheritance

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 构造函数
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
open class Person(var name: String, var age: Int)  // 基类。如果子类有主构造函数，则基类必须在主构造函数中立即初始化
class Student(name: String, age: Int, var no: String, var score: Int) : Person(name, age)  // 子类。有主构造函数

open class Person1(name: String) {
    /**
     * 次级构造函数
     */
    constructor(name: String, age: Int) : this(name) {  // 初始化
        println("-------基类次级构造函数---------")
    }
}

class Student1 : Person1 {
    /**
     * 如果子类没有主构造函数，则必须在每一个二级构造函数中用super关键字初始化基类，或者在代理另一个构造函数。初始化基类时，可以调用基类的不同构造方法
     */
    constructor(name: String, age: Int, no: String, score: Int) : super(name, age) {
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}

fun main(args: Array<String>) {
    val s = Student("Google", 18, "S12346", 89)
    println("学生名：${s.name}")
    println("年龄：${s.age}")
    println("学生号：${s.no}")
    println("成绩：${s.score}")

    Student1("Google", 18, "S12345", 89)
}