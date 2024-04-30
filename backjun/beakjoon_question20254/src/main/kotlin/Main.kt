fun main(args: Array<String>) {
    question20254()
}

fun question20254() {
    val numbers = readln().split(" ").map { it.toInt() }
    println("${(numbers[0] * 56) + (numbers[1] * 24) + (numbers[2] * 14) + (numbers[3] * 6)}")
}