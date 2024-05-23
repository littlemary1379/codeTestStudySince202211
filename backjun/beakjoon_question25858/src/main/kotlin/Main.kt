fun main(args: Array<String>) {
    question25858()
}

fun question25858() {
    val price = readln().split(" ").map { it.toInt() }
    val questionCount = mutableListOf<Int>()

    for(i in 1 .. price[0]) {
        questionCount.add(readln().toInt())
    }

    questionCount.forEach {
        println(price[1] / questionCount.sum() * it)
    }
}