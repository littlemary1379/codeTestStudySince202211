fun main(args: Array<String>) {
    question25881()
}

fun question25881() {
    val price = readln().split(" ").map { it.toInt() }
    val count = readln().toInt()
    for (i in 1 .. count) {
        val use = readln().toInt()
        if(use <= 1000) {
            println("$use ${use * price[0]}")
        } else {
            println("$use ${1000 * price[0] + (use - 1000) * price[1]}")
        }
    }
}