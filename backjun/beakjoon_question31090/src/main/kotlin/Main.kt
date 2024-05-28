fun main(args: Array<String>) {
    question31090()
}

fun question31090() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        readln().toInt().let {
            if((it + 1) % (it % 100) == 0) {
                println("Good")
            } else {
                println("Bye")
            }
        }
    }
}