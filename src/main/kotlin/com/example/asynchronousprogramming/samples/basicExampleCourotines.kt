package com.example.asynchronousprogramming.samples

//runBlocking is a coroutine builder
//launch is also a coroutine builder that bridges the non-coroutine world of a regular fun main() and the code with coroutines inside of runBlocking { ... } curly braces.

import kotlinx.coroutines.*

fun main2() = runBlocking {
    coroutineScope{
        launch{
            delay(500)
            print("1")
        }
        print("2")
    }

    print("3")
}

fun main() = runBlocking<Unit> {
    launch(CoroutineName("child")) {
        println("My context is $coroutineContext}")
    }
}