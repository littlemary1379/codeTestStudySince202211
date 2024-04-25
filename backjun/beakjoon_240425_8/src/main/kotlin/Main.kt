import kotlin.math.abs

fun main(args: Array<String>) {
    question2420()
}

fun question2420() {
    val favorite = readln().split(" ").map { it.toLong() }
    println(abs(favorite[0] - favorite[1]))
}