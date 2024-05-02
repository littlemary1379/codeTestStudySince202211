fun main(args: Array<String>) {
    question28444()
}

fun question28444() {
    val numbers = readln().split(" ").map { it.toInt() }

    println("${(numbers[0] * numbers[1]) - (numbers[2] * numbers[3] * numbers[4])}")
}