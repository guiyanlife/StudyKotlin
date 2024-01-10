package com.github.studykotlin.coroutine.c01_basic

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld3()
}

suspend fun doWorld3() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}