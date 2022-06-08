package com.github.studykotlin.basic.c08_extension

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 扩展声明为成员
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class D1 {  // 扩展方法的目标类型的实例称为扩展接收者。D1为扩展接收者
    fun bar() {
        println("D1 bar")
    }
}

class C1 {  // 扩展方法定义所在类的实例称为分发接收者。在C1类内，创建了D1类的扩展，C1为分发接收者
    fun baz() {
        println("C1 baz")
    }

    fun bar() {
        println("C1 bar")
    }

    /**
     * 在一个类内部可以为另一个类声明扩展
     */
    fun D1.foo() {
        bar()  // 调用D1.bar，扩展接收者D1优先
        baz()  // 调用C1.baz，即分发收受者C1的成员函数baz
        this@C1.bar()  // 调用C1.bar
    }

    fun caller(d1: D1) {
        d1.foo()  // 调用扩展函数
    }
}

open class F    // 扩展接收者
class F1 : F()  // 扩展接收者
open class G {  // 分发接收者
    /**
     * 以成员的形式定义的扩展函数，可以声明为open
     */
    open fun F.foo() {
        println("F.foo in G")
    }

    /**
     * 扩展函数的派发过程中，针对分发接收者是虚拟的，针对扩展接收者仍然是静态的
     */
    open fun F1.foo() {
        println("F1.foo in G")
    }

    fun caller(f: F) {
        f.foo()  // 调用扩展函数
    }
}

class G1 : G() {  // 分发接收者
    override fun F.foo() {
        println("F.foo in G1")
    }

    override fun F1.foo() {
        println("F1.foo in G1")
    }
}

fun main(args: Array<String>) {
    val c1: C1 = C1()
    val d1: D1 = D1()
    c1.caller(d1)

    G().caller(F())   // 输出"F.foo in G"
    G1().caller(F())  // 输出"F.foo in G1"，分发接收者虚拟解析
    G().caller(F1())  // 输出"F.foo in G"，扩展接收者静态解析
}
