package com.vitaliyhtc.kotlinfirsttry

//Idioms
fun main(args: Array<String>) {
    whatIsThat()

    highOrderFunctions()

    someMath()
}


//TODO: find what is that!
fun whatIsThat() {
    println()
    val multiply = { num1: Int, num2: Int -> num1 * num2 }
    println("4 * 16 = ${multiply(4, 16)}")
}

fun highOrderFunctions() {
    println()

    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }
    println("evenList")
    println(evenList)
    evenList.forEach { n -> println(n) }
}

fun someMath() {
    println()

    val mult3 = makeMAthFunc(3)
    println("5 * 3 = ${mult3(5)}")

    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1, 2, 3, 4, 5)

    mathOnList(numList2, multiply2)
}

fun makeMAthFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}