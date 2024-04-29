fun main(args: Array<String>) {
    question16430()
}

fun question16430() {
    val cheese = readln().split(" ").map { it.toInt() }

    println("${cheese[1] - cheese[0]} ${cheese[1]}")
}