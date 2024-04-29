fun main(args: Array<String>) {
    question7891()
}

fun question7891() {
    val count = readln().toInt()

    for(i in 1 .. count) {
        val numbers = readln().split(" ").map { it.toLong() }
        println(numbers.sum())
    }
}