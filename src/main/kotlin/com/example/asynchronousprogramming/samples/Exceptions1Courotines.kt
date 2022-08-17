package com.example.asynchronousprogramming.samples

import kotlinx.coroutines.*
import java.io.IOException


val job: Job = Job()
    val scope = CoroutineScope(Dispatchers.Default + job)

    fun doWork(): Deferred<String> = scope.async {
        println("doWork1")
        throw IOException()
        "dfsdsd"
    }   // (1)

    fun doWork2(): Deferred<String> = scope.async {
        println("doWork2")
        throw Exception()
        "dfsdsd"
    }   // (1)
    fun loadData() = scope.launch {
        try {
            doWork().await()
            doWork2().await()
        } catch (e: Exception) {
            println("ERRO Exception")
        } catch (e: IOException){
            println("ERRO IOException")
        }
    }

    fun main(){
        loadData()
    }
