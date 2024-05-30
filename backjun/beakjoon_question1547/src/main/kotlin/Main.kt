fun main(args: Array<String>) {
    question1547()
}

fun question1547() {
    val count = readln().toInt()
    val list = mutableListOf(1, 2, 3)
    for(i in 1 .. count) {
        readln().split(" ").map { it.toInt() }.let {
            val index1 = list.indexOf(it[0])
            val index2 = list.indexOf(it[1])
            list[index1] = it[1]
            list[index2] = it[0]
        }
    }

    println(list[0])

}