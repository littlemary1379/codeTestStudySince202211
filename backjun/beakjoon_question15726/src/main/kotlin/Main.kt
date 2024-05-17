import kotlin.math.max

fun main(args: Array<String>) {
    question15276()
}

fun question15276() {
    val numbers = readln().split(" ").map { it.toDouble() }
    val number1 = numbers[0] * numbers[1] / numbers[2]
    val number2 = numbers[0] / numbers[1] * numbers[2]

    println(max(number1, number2).toInt())
}