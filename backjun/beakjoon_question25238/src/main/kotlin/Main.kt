fun main(args: Array<String>) {
    question25238()
}

fun question25238() {
    val damage = readln().split(" ").map { it.toDouble() }
    println(if((damage[0] / 100) * (100 - damage[1]) >= 100) {
        "0"
    } else {
        "1"
    })
}