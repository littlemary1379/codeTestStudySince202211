import kotlin.math.floor

fun main(args: Array<String>) {
    question14652()
}

fun question14652() {
    val numbers = readln().split(" ").map { it.toInt() }

    val width = floor(numbers[2].toDouble() / numbers[1]).toInt()
    val height = numbers[2] % numbers[1]

    println("$width $height")
}