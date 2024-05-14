fun main(args: Array<String>) {
    question10480()
}

fun question10480() {
    val count = readln().toInt()
    for (i in 1 .. count) {
        val number = readln().toInt()
        println("${number} is ${if(number % 2 == 0) "even" else "odd"}")
    }
}