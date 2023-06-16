import kotlin.math.pow

fun main(args: Array<String>) {
    question2903()
}

fun question2903() {
    var dot = 2

    var count = readLine()!!.toInt()

    for(i in 1 .. count) {
        dot = dot + dot - 1
    }
    println((dot.toDouble().pow(2)).toInt())
}