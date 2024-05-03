fun main(args: Array<String>) {
    question5717()
}

fun question5717() {
    while (true) {
        val friend = readln()
        if(friend == "0 0") {
            break
        } else {
            println(friend.split(" ").sumOf { it.toInt() })
        }
    }
}