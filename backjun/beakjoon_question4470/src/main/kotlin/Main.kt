fun main(args: Array<String>) {
    question4470()
}

fun question4470() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        println("$i. ${readln()}")
    }
}