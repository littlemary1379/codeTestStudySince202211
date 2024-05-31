fun main(args: Array<String>) {
    question2443()
}

fun question2443() {
    val count = readln().toInt()
    for (i in 0..<count) {
        println("${" ".repeat(i)}${"*".repeat((count - i) * 2 - 1)}")
    }
}