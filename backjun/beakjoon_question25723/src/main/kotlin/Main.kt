import kotlin.math.pow

fun main(args: Array<String>) {
    question24723()
}

fun question24723() {
    val floor = readln().toInt()
    println(2.0.pow(floor).toInt())
}