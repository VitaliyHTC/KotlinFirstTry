package clazz

// https://www.youtube.com/watch?v=H_oGi8uuDpA
fun main(args: Array<String>) {

    var nullVal: String? = null

    fun returnNull(): String? {
        return null
    }

    var nullVal2 = returnNull()

    if(nullVal2 != null) {
        println("${nullVal2.length}")
    }

    println("${nullVal2?.length}")

    var nullVal3: String = nullVal2!! // shoot myself in foot

    var nullVal4: String = returnNull() ?: "No Name"

}