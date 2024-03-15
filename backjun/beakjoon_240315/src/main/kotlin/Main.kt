fun main(args: Array<String>) {
    question11651()
}

fun question11651() {
    val count = readln().toInt()
    val list = mutableListOf<Array<Int>>()

    for(i in 0 ..< count) {
        list.add(readln().split(" ").map { it.toInt() }.toTypedArray())
    }

    list.sortedWith(compareBy({it[1]}, {it[0]})).forEach {
        println(it.joinToString(" "))
    }
}