package com.example.asynchronousprogramming.samples

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(){
    repeat(100_000) { // launch a lot of coroutines
        thread {
            Thread.sleep(5000L)
            print(".")
        }
    }
}