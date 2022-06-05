package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 匿名内部类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Test {
    var v = "成员属性"

    fun setInterFace(test: TestInterface) {
        test.test()
    }

    /**
     * 定义接口
     */
    interface TestInterface {
        fun test()
    }
}

fun main(args: Array<String>) {
    var test = Test()

    // 采用对象表达式来创建接口对象，即匿名内部类的实例
    test.setInterFace(object : Test.TestInterface {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })
}