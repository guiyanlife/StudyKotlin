package com.github.studykotlin.basic.c13_delegation

/**
 * Copyright (c) 2024 GitHub, Inc.
 * Description: 类委托
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class ClassDelegation(b: Base) : Base by b  // 通过关键字by建立委托类。派生类ClassDelegation继承了接口Base所有方法，并且委托一个传入的Base类的对象来执行这些方法

interface Base {  // 创建接口
    fun print()
}

class BaseImpl(val x: Int) : Base {  // 实现此接口的被委托的类
    override fun print() {
        print(x)
    }
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    // 类的委托即一个类中定义的方法实际是调用另一个类的对象的方法来实现的。
    ClassDelegation(b).print()  // 输出 10
}