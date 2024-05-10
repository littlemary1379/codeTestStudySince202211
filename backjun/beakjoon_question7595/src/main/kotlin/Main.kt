fun main(args: Array<String>) {
    question7595()
}

fun question7595() {
    while (true) {
        val count = readln().toInt()
        if(count == 0) {
            break
        } else {
            for(i in 1 .. count) {
                println("*".repeat(i))
            }
        }
    }
}