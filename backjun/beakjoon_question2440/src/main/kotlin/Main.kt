fun main(args: Array<String>) {
    question2440()
}

fun question2440() {
    val count = readln().toInt()
    for (i in count downTo 1) {
        println("*".repeat(i))
    }
}