package com.github.studykotlin.coroutine.c07_flow

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    simple3().forEach { value -> println(value) }
}

suspend fun simple3(): List<Int> {
    delay(1000) // pretend we are doing something asynchronous here
    return listOf(1, 2, 3)
}