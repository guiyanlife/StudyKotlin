package com.github.studykotlin.basic.c06_inheritance

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 重写
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
open class Person2 {  // 用户基类
    /**
     * 在基类中，使用fun声明函数时，如果允许子类重写该函数，那么就要手动添加open修饰它
     */
    open fun study() {  // 允许子类重写
        println("我毕业了")
    }

    /**
     * 函数默认为final修饰，不能被子类重写
     */
    fun teacher() {
        println("我是毕业生的老师")
    }
}

class Student2 : Person2() {
    /**
     * 子类重写方法使用override关键词
     */
    override fun study() {  // 重写方法
        println("我在读大学")
    }
}

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    /**
     * 接口的成员变量默认是open的
     */
    fun f() {
        print("B")
    }

    fun b() {
        print("b")
    }
}

class C : A(), B {
    /**
     * 如果有多个相同的方法（继承或者实现自其他类），则必须要重写该方法，使用super范型去选择性地调用父类的实现
     */
    override fun f() {
        super<A>.f()  // 调用 A.f()
        super<B>.f()  // 调用 B.f()
    }
}

fun main(args: Array<String>) {
    val s = Student2()
    s.study()

    val c = C()
    c.f()
}