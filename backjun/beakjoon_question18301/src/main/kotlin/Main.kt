fun main(args: Array<String>) {
    question18301()
}

fun question18301() {
    val rats = readln().split(" ").map { it.toInt() }
    println("${((rats[0] + 1) * (rats[1] + 1) / (rats[2] + 1)) - 1}")
}