fun main(args: Array<String>) {
    question10872()
}

fun question10872() {
    readln().toInt().let {
        var count = 1
        for(i in 1 .. it) {
            count *= i
        }
        println(count)
    }
}