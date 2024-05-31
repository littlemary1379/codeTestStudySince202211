fun main(args: Array<String>) {
    question2445()
}

fun question2445() {
    val count = readln().toInt()
    for(i in 1..<count * 2) {
        if(i <= count) {
            println("${"*".repeat(i)}${" ".repeat((count - i) * 2)}${"*".repeat(i)}")
        } else {
            println("${"*".repeat(count * 2 - i)}${" ".repeat((i - count) * 2)}${"*".repeat(count * 2 - i)}")
        }
    }
}