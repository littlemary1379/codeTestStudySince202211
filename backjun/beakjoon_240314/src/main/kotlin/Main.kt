fun main(args: Array<String>) {
    question11650()
}

fun question11650() {
    val count = readln().toInt()
    val list = mutableListOf<List<Int>>()
    for (i in 1 .. count) {
        list.add(readln().split(" ").map { it.toInt() })
    }

    list.sortedWith(compareBy({it[0]}, {it[1]})).forEach {
        println(it.joinToString(" "))
    }
}