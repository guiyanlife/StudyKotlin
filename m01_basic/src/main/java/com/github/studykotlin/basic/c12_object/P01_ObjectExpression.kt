package com.github.studykotlin.basic.c12_object

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 对象表达式
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class ObjectExpression {
    fun setInterface(test: TestInterface) {
        test.test()
    }

    /**
     * 定义接口
     */
    interface TestInterface {
        fun test()
    }
}

open class A(x: Int) {
    public open val y: Int = x
}

interface B {
    fun test()
}

class C {
    /**
     * 匿名对象只能用作在本地和私有作用域中声明的类型。私有函数，所以其返回类型是匿名对象类型
     */
    private fun foo() = object {
        val x: String = "x"
    }

    /**
     * 匿名对象作为公有函数的返回类型或者用作公有属性的类型，该函数或属性的实际类型会是匿名对象声明的超类型。这里没有声明任何超类型，所以返回类型是Any
     */
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 返回类型是匿名对象类型，可以解析属性"x"
//        val x2 = publicFoo().x  // 返回类型是Any，不能解析属性"x"
    }
}

fun main(args: Array<String>) {
    // 通过对象表达式实现一个匿名内部类的对象用于方法的参数中
    var testCount = 0
    ObjectExpression().setInterface(object : ObjectExpression.TestInterface { // 对象表达式是在使用它们的地方立即执行的
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
            testCount++  // 在对象表达中可以方便的访问到作用域中的其他变量
        }
    })

    // 对象可以继承于某个基类或者实现其他接口
    val ab: A = object : A(1), B {  // 如果超类型有一个构造函数，则必须传递参数给它。多个超类型和接口可以用逗号分隔
        override val y = 15
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    }
    println(ab.y)
    (ab as B).test()

    // 可以越过类的定义直接得到一个对象
    val site = object {
        var name: String = "谷歌"
        var url: String = "www.google.com"
    }
    println(site.name)
    println(site.url)
}