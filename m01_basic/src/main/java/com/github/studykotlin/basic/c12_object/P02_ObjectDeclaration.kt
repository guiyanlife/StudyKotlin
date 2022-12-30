package com.github.studykotlin.basic.c12_object

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 对象声明
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
object ObjectDeclaration {  // 使用object关键字来声明一个对象，在Kotlin中可以方便的通过对象声明来获得一个单例
    lateinit var mValues: IntArray
    lateinit var name: String
    fun setData(values: IntArray) {
        mValues = values
    }

    val dataLength: Int
        get() = mValues.size
}

open class D {
    open fun foo() {
        println("D foo")

    }

    open fun bar() {
        println("D bar")
    }
}

object E : D() {  // 对象可以有超类型
    override fun foo() {
        println("E foo")
    }

    override fun bar() {
        println("E bar")
    }
}

class Site {
    var name = "谷歌"

    /**
     * 对象声明在一个类的内部
     */
    object DeskTop {
        var url = "www.google.com"
        fun showName() {
//            print { "desk legs $name" }  // 错误，不能访问到外部类的方法和变量
        }
    }
}

fun main(args: Array<String>) {
    // 引用该对象可以直接使用其名称
    ObjectDeclaration.setData(intArrayOf(1, 2, 3))

    // 可以定义一个变量来获取这个对象
    val data1 = ObjectDeclaration
    val data2 = ObjectDeclaration  // 当定义两个不同的变量来获取这个对象时，不能得到两个不同的变量，也就是说获得一个单例
    data1.name = "test"
    println("data1 name = ${data2.name}")

    // 访问有超类型的对象
    E.foo()
    E.bar()

    // 访问声明在一个类的内部的对象
    val site = Site()
//    site.DeskTop.url  // 错误，不能通过外部类的实例访问到该对象
    Site.DeskTop.url  // 正确，只能通过类名来访问该对象
}