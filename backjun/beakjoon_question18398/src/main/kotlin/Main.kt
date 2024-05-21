fun main(args: Array<String>) {
    question18398()
}

fun question18398() {
    val case = readln().toInt()
    for (i in 1 .. case) {
        val questions = readln().toInt()
        for(j in 1 .. questions) {
            val numbers = readln().split(" ").map { it.toInt() }
            println("${numbers[0] + numbers[1]} ${numbers[0] * numbers[1]}")
        }
    }
}