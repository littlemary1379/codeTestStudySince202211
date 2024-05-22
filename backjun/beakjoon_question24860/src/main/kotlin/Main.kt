fun main(args: Array<String>) {
    question24860()
}

fun question24860() {
    val k = readln().split(" ").map { it.toLong() }.let { it[0] * it[1] }
    val r = readln().split(" ").map { it.toLong() }.let { it[0] * it[1] }
    val h = readln().split(" ").map { it.toLong() }.let { it[0] * it[1] * it[2] }

    println((k + r) * h)
}