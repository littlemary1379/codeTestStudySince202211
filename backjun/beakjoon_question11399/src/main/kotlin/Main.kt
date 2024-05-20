fun main(args: Array<String>) {
    question11399()
}

fun question11399() {
    val user = readln().toInt()
    val time = readln().split(" ").map { it.toInt() }.sorted()

    var addAll = 0
    for(i in 1 .. user) {
        addAll += time.subList(0, i).sum()
    }

    println(addAll)
}