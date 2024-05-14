fun main(args: Array<String>) {
    question10797()
}

fun question10797() {
    val day = readln().toInt()
    println(readln().split(" ").map { it.toInt() }.count { it == day })
}