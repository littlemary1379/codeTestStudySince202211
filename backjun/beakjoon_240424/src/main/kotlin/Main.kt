fun main(args: Array<String>) {
    question3046()
}

fun question3046() {

    // R1 S
    val numbers = readln().split(" ").map { it.toInt() }
    println((numbers[1] * 2) - numbers[0])
}