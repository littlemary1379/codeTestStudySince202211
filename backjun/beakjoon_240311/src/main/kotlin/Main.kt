fun main(args: Array<String>) {
    question25305()
}

fun question25305() {
    val goal = readln().split(" ").map { it.toInt() }
    val grade = readln().split(" ").map { it.toInt() }.sortedDescending()

    println(grade[(goal[1] - 1)])
}