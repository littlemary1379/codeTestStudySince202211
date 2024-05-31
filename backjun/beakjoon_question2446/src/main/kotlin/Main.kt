fun main(args: Array<String>) {
    question2446()
}

fun question2446() {
    val count = readln().toInt()
    for(i in 0 ..< count * 2 - 1) {
        if(i <= (count * 2 - 1) / 2) {
            println("${" ".repeat(i)}${"*".repeat((count - 1 - i) * 2 + 1)}")
        } else {
            println("${" ".repeat((count - 1) * 2 - i)}${"*".repeat((i - count + 1) * 2 + 1)}")
        }

    }
}