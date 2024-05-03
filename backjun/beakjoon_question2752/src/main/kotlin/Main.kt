fun main(args: Array<String>) {
    question2752()
}

fun question2752() {
    val numbers = readln().split(" ").map { it.toInt() }
    println(numbers.sorted().joinToString(" "))
}