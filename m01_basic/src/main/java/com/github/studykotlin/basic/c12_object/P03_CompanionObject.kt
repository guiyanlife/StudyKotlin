package com.github.studykotlin.basic.c12_object

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 伴生对象
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class CompanionObject {
    /**
     * 类内部的对象声明用companion关键字标记，它就与外部类关联在一起，可以直接通过外部类访问到对象的内部元素
     * 一个类里面只能声明一个内部关联对象，即关键字companion只能使用一次
     */
    companion object Factory {
        fun create(): CompanionObject = CompanionObject()
    }
}

class CompanionObject1 {
    /**
     * 省略伴生对象的对象名，使用Companion替代需要声明的对象名
     */
    companion object {
    }
}

interface Factory<T> {
    fun create(): T
}

class CompanionObject2 {
    /**
     * 伴生对象还可以实现接口
     */
    companion object : Factory<CompanionObject2> {
        override fun create(): CompanionObject2 = CompanionObject2()
    }
}

fun main(args: Array<String>) {
    val instance = CompanionObject.create()  // 访问到对象的内部元素
    val instance1 = CompanionObject1.Companion // 伴生对象的初始化是在相应的类被加载（解析）时，与Java静态初始化器的语义相匹配
    val instance2 = CompanionObject2.create() // 伴生对象的成员看起来像其他语言的静态成员，但在运行时他们仍然是真实对象的实例成员
}