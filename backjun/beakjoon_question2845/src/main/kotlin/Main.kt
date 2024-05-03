fun main(args: Array<String>) {
    question2845()
}

fun question2845() {
    val realPerson = readln().split(" ").map { it.toInt() }.let {
        it[0] * it[1]
    }
    val newsPerson = readln().split(" ").map { it.toInt() - realPerson }
    println(newsPerson.joinToString(" "))
}