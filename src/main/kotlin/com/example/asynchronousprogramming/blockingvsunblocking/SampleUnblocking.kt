package com.example.asynchronousprogramming.blockingvsunblocking

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    val start_time = System.currentTimeMillis()
    val word = "Tweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondigingTweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespra-akskrywerspersverklaringuitreikingsmediakonferensieaankondiging"
    runBlocking{
        repeat(100_000) {
            launch {
                removeLetterA2(word)
            }
        }
    }
    println(System.currentTimeMillis()-start_time)
}

fun removeLetterA2(stringWithLetterA:String): String {
    var stringWithOutLetterA = stringWithLetterA.replace("a", "")
    stringWithOutLetterA = stringWithOutLetterA.replace("A", "")
    return stringWithOutLetterA
}