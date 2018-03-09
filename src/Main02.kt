package com.vitaliyhtc.kotlinfirsttry

//Idioms
fun main(args: Array<String>) {
    whatIsThat()

    highOrderFunctions()
}


//TODO: find what is that!
fun whatIsThat() {
    val multiply = { num1: Int, num2: Int -> num1 * num2 }

    println("4 * 16 = ${multiply(4, 16)}")
}

fun highOrderFunctions() {
    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }
    println("evenList")
    println(evenList)
    evenList.forEach { n -> println(n) }
}

