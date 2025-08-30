package com.github.studykotlin.coroutine.c07_flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    (1..3).asFlow() // a flow of requests
        .transform { request ->
            emit("Making request $request")
            emit(performRequest9(request))
        }
        .collect { response -> println(response) }
}

suspend fun performRequest9(request: Int): String {
    delay(1000) // imitate long-running asynchronous work
    return "response $request"
}