package com.github.studykotlin.coroutine.c07_flow

fun main() {
    simple2().forEach { value -> println(value) }
}

fun simple2(): Sequence<Int> = sequence { // sequence builder
    for (i in 1..3) {
        Thread.sleep(100) // pretend we are computing it
        yield(i) // yield next value
    }
}