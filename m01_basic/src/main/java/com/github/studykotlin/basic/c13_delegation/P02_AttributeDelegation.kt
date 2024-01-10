package com.github.studykotlin.basic.c13_delegation

import kotlin.reflect.KProperty

/**
 * Copyright (c) 2024 GitHub, Inc.
 * Description: 属性委托
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class AttributeDelegation {  // 定义包含属性委托的类
    // 属性委托指的是一个类的某个属性值不是在类中直接进行定义，而是将其托付给一个代理类，从而实现对该类的属性统一管理
    var p: String by Delegate()  // 属性委托语法格式：val/var <属性名>: <类型> by <表达式>
}

class Delegate {  // 委托的类。属性委托不必实现任何接口，但必须提供getValue()函数，对于var属性，还需要setValue()函数
    /**
     * 属性的get()方法将被委托给委托类的getValue()方法。
     */
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    /**
     * 属性的set()方法将被委托给委托类的setValue()方法
     */
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}

fun main(args: Array<String>) {
    val e = AttributeDelegation()
    println(e.p)  // 访问该属性，调用getValue()函数

    e.p = "Google"  // 调用setValue()函数
    println(e.p)
}