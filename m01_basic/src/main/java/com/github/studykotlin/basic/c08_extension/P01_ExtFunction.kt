package com.github.studykotlin.basic.c08_extension

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 扩展函数
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class ExtFunction(var name: String)

fun ExtFunction.print() {  // 扩展函数可以在已有类中添加新的方法，不会对原类做修改。扩展是一种静态行为，对被扩展的类代码本身不会造成任何影响
    println("用户名：$name")
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {  // MutableList的扩展函数swap，调换不同位置的值
    val tmp = this[index1]  // this对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(arg: Array<String>) {
    var user = ExtFunction("Google")
    user.print()

    val l = mutableListOf(1, 2, 3)
    l.swap(0, 2)  // 位置0和2的值做了互换
    println(l.toString())
}