fun main(args: Array<String>) {
    question2441()
}

fun question2441() {
    val count = readln().toInt()
    for(i in 0 ..< count) {
        println("${" ".repeat(i)}${"*".repeat(count - i)}")
    }
}