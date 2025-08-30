package com.github.studykotlin.coroutine.c07_flow

fun main() {
    simple().forEach { value -> println(value) }
}

fun simple(): List<Int> = listOf(1, 2, 3)