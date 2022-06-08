package com.github.studykotlin.basic.c08_extension

import com.github.studykotlin.basic.c08_extension.no

/**
 * Copyright (c) 2022 GitHub, Inc.
 * Description: 扩展的作用域
 * Author(s): Gui Yan (guiyanlife@163.com)
 */
fun main(args: Array<String>) {
    // 使用定义包之内的扩展，直接使用
    var user = ExtFunction("Google")
    user.print()

    // 使用定义包之外的扩展，通过import导入扩展的函数名进行使用
    println(CompanionObject.no)
}