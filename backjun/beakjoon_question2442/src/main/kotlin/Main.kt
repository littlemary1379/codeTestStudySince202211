fun main(args: Array<String>) {
    question2442()
}

fun question2442() {
    var count = readln().toInt()
    for(i in 0 ..< count) {
        println("${" ".repeat((count - 1) - i)}${"*".repeat(2 * i + 1)}")
    }
}