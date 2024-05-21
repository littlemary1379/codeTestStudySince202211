import kotlin.math.ceil

fun main(args: Array<String>) {
    question18691()
}

fun question18691() {
    val case = readln().toInt()
    for (i in 1 .. case) {
        val pokemon = readln().split(" ").map { it.toInt() }
        val candyKilo = when(pokemon[0]) {
            1 -> 1
            2 -> 3
            3 -> 5
            else -> 0
        }

        if(pokemon[2] - pokemon[1] > 0) {
            println((pokemon[2] - pokemon[1]) * candyKilo)

        } else {
            println("0")
        }
    }
}