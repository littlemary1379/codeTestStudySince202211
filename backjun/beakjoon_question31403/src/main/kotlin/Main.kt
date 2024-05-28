fun main(args: Array<String>) {
    question31403()
}

fun question31403() {
    val list = mutableListOf<String>()
    for(i in 1 .. 3) {
        list.add(readln())
    }

    println(list[0].toInt() + list[1].toInt() - list[2].toInt())
    println((list[0] + list[1]).toInt() - list[2].toInt())
}