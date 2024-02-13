fun main(args: Array<String>) {
    question2587()
}

fun question2587() {
    val list = mutableListOf<Int>()

    for (i in 1 .. 5) {
        list.add(readln().toInt())
    }

    list.sort()

    println(list.sum() / list.count())
    println(list[2])
}