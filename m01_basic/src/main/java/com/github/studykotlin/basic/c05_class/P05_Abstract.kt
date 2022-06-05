package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 抽象类
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
abstract class Abstract : Base() {  // 无需对抽象类或抽象成员标注open注解
    /**
     * 抽象是面向对象编程的特征之一，类本身，或类中的部分成员，都可以声明为abstract的
     */
    abstract override fun f()  // 抽象成员在类中不存在具体的实现
}

open class Base {
    open fun f() {}
}