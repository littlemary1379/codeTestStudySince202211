fun main(args: Array<String>) {
    question26546()
}

fun question26546() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        readln().split(" ").let {
            println("${it[0].substring(0 ..< it[1].toInt())}${it[0].substring(it[2].toInt())}")
        }
    }
}