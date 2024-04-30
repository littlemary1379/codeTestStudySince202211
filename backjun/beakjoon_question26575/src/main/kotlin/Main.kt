fun main(args: Array<String>) {
    question26575()
}

fun question26575() {
    val count = readln().trim().toInt()
    for (i in 1 .. count) {
        val dogs = readln().trim().split(" ").map { it.toDouble() }
        val price = dogs[0] * dogs[1] * dogs[2]
        println("$${String.format("%.2f", price)}")
    }
}