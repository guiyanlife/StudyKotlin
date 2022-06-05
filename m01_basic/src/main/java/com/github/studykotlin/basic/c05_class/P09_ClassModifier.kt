package com.github.studykotlin.basic.c05_class

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 类的修饰符
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
abstract class Object     // 抽象类
final class Object1       // 类不可继承，默认属性
enum class Object2        // 枚举类
open class Object3        // 类可继承，类默认是final的
annotation class Object4  // 注解类

private class Object5       // 仅在同一个文件中可见
open class Object6 {
    protected fun foo() {}  // 同一个文件中或子类可见
}

public class Object7        // 所有调用的地方都可见
internal class Object8      // 同一个模块中可见

// 实例
private fun foo() {}     // 在本文件内可见
public var bar: Int = 5  // 该属性随处可见
internal val baz = 6     // 相同模块内可见