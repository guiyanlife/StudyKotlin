package com.github.studykotlin.basic.c08_extension

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 伴生对象的扩展
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class CompanionObject {
    companion object {}  // 类定义有一个伴生对象
}

fun CompanionObject.Companion.foo() {  // 为伴生对象定义扩展函数
    println("伴随对象的扩展函数")
}

val CompanionObject.Companion.no: Int  // 为伴生对象定义扩展属性
    get() = 10

fun main(args: Array<String>) {
    println("no:${CompanionObject.no}")
    CompanionObject.foo()  // 伴生对象通过“类名.”形式调用伴生对象，伴生对象声明的扩展函数，通过用类名限定符来调用
}