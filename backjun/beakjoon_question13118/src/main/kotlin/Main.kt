fun main(args: Array<String>) {
    question13118()
}

fun question13118() {
    var person = readln().split(" ").map { it.toInt() }
    var apple = readln().split(" ").map { it.toInt() }

    println(person.indexOfFirst { it == apple[0] } + 1)
}