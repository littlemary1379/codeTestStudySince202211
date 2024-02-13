fun main(args: Array<String>) {
    question2750()
}

fun question2750() {
    val count = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 1 .. count) {
        list.add(readln().toInt())
    }

    list.sorted().forEach {
        println(it)
    }
}