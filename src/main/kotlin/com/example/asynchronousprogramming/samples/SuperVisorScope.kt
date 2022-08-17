package com.example.asynchronousprogramming.samples

import kotlinx.coroutines.*


suspend fun runListItens1(items: List<String>) =
        supervisorScope {
            items.forEach { item ->
                launch {
                    if(item  == "item3")
                        throw Error()
                    println(item)
                }
            }
        }


suspend fun runListItens2(items: List<String>) =
        coroutineScope {
            items.forEach { item ->
                launch {
                    if(item  == "item3")
                        throw Error()
                    println(item)
                }
            }
        }

fun main() = runBlocking<Unit> {
    val items = listOf<String>("item1", "item2", "item3", "item4", "item5")
    runListItens2(items)
}