package com.github.studykotlin.coroutine.c07_flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    simple13().collect { value -> log("Collected $value") }
}

fun simple13(): Flow<Int> = flow {
    log("Started simple flow")
    for (i in 1..3) {
        emit(i)
    }
}

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")