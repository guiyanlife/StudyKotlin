package com.github.studykotlin.basic.c06_inheritance

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 继承
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Inherit(p: Int) : Base(p)
open class Base(p: Int)  // 定义基类。如果一个类要被继承，需要使用open关键字进行修饰

class Empty  // 从Any隐式继承。所有类都继承Any类，它是所有类的超类，对于没有超类型声明的类是默认超类

fun main(args: Array<String>) {
    // Any默认提供了以下三个函数。Any不是java.lang.Object
    val empty = Empty()
    println(empty.equals(null))  // equals()
    println(empty.hashCode())    // hashCode()
    println(empty.toString())    // toString()
}