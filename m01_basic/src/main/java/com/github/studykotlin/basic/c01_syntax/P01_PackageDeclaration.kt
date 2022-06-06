package com.github.studykotlin.basic.c01_syntax  // 包的声明

// 以下包会默认导入到每个Kotlin文件中
import kotlin.*
import kotlin.annotation.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 包声明
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
class PackageDeclaration {  // 类的全名是com.github.studykotlin.basic.c01_syntax.PackageDeclaration
    companion object {
        fun test() {}  // 函数全名是com.github.studykotlin.basic.c01_syntax.PackageDeclaration.test()
    }
}

fun main(args: Array<String>) {
    com.github.studykotlin.basic.c01_syntax.PackageDeclaration.test()
    val google = com.github.studykotlin.basic.c01_syntax.PackageDeclaration()
    println(google.toString())
}