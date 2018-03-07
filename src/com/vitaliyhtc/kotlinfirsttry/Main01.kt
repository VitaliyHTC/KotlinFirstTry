package com.vitaliyhtc.kotlinfirsttry

/**
 * see: https://kotlinlang.org/docs/reference/basic-syntax.html
 *
 * some description
 */

fun main(args: Array<String>) {
//    println("Hello World!")
//    println("Second launch of Kotlin code in IDEA")
    val a = 7
    val b1 = 9
    val b2 = 7
    val c = 3

    var c1 = c
    c1++
    println("var c1 = $c1")


    val result = sum2(b1, b2)

    printString1("sum of $a + $b1 = " + sum1(a, b1))
    printString2("sum of $a + $b2 = " + sum2(a, b2))
    println("sum of $b1 + $b2 = $result")
    println("2 * $c = " + double(c))

    println()
    printProduct("str", "4")
    printProduct("8", "4")

    println()
    println("Type cast:")
    println("getStringLength1 of \"147 Int\" " + getStringLength1("147 Int"))
    println("getStringLength2 of 147 " + getStringLength2(147))
    println("getStringLength3 of \"96\" " + getStringLength3("96"))

    println()
    useLoops()

    println()
    useWhen()

    println()
    useRanges()

    println()
    useCollections()
}


fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printString1(s: String): Unit {
    println(s)
}

fun printString2(s: String) {
    println(s)
}

fun double(x: Int): Int {
    return 2 * x
}

fun maxOf1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxOf3(a: Int, b: Int) = if (a > b) a else b

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null || y == null) {
        println("x = $arg1 or y = $arg2 or both have wrong number format")
    } else {
        println("$x * $y = " + x * y)
    }
}

fun parseInt(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (ex: NumberFormatException) {
        println(ex)
        null
    }
}


fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}


fun useLoops() {
    println("Loops")
    val items = listOf("apple", "banana", "kiwi")

    println("___for loop 1")
    for (item in items) {
        println(item)
    }
    println("___for loop 2")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println("___while loop")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun useWhen() {
    println("when")
    println("1 " + describe(1))
    println("Hello " + describe("Hello"))
    println("147L " + describe(147L))
    println("33 " + describe(33))
    println("true " + describe(true))

}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }


fun useRanges() {
    useRanges1()
    useRanges2()
    useRanges3()
    useRanges4()
}

fun useRanges1() {
    println("ranges1")
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun useRanges2() {
    println("ranges2 Check if a number is out of range:")

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
}

fun useRanges3() {
    println("ranges3 Iterating over a range:")
    for (x in 1..5) {
        print(x)
    }
    println()
}

fun useRanges4() {
    println("ranges4 or over a progression:")
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

fun useCollections() {
    println()
    println("Collections")

    val items = listOf("apple", "banana", "kiwi", "orange", "ananas :)")

    for (item in items) {
        println(item)
    }

    println("Checking if a collection contains an object using in operator:")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println("Using lambda expressions to filter and map collections:")
    items
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}