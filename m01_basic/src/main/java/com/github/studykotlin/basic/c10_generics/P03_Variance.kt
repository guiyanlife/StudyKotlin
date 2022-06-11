package com.github.studykotlin.basic.c10_generics

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 型变
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class Variance<out T>(val a: T) {  // 声明处的类型变异使用协变注解修饰符：out，生产者out
    /**
     * out使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型
     */
    fun foo(): T {
        return a
    }
}

class Variance1<in T>(a: T) {  // 声明处的类型变异使用协变注解修饰符：in，消费者in
    /**
     * in使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型
     */
    fun foo(a: T) {
    }
}

fun main(args: Array<String>) {
    // 协变。Any是String的父类，那么Variance<Any>是Variance<String>的父类
    var strCo: Variance<String> = Variance<String>("str")
    var anyCo: Variance<Any> = Variance<Any>("ant")
    anyCo = strCo
    println(anyCo.foo())  // 输出a

    // 逆变。Any是String的父类，那么Variance1<String>是Variance1<Any>的父类
    var strCo1: Variance1<String> = Variance1("str")
    var anyCo1: Variance1<Any> = Variance1<Any>("any")
    strCo1 = anyCo1
}
