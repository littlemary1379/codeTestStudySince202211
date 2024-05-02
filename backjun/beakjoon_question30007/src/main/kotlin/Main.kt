fun main(args: Array<String>) {
    question30007()
}

fun question30007() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        // A B X
        // W = A(X - 1) + B
        val ramen = readln().split(" ").map { it.toInt() }
        println(ramen[0] * (ramen[2] - 1) + ramen[1])
    }
}