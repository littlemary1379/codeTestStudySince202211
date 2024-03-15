fun main(args: Array<String>) {
    question1181()
}

fun question1181() {
    val count = readln().toInt()
    val list = mutableListOf<String>()
    for(i in 0 ..< count) {
//        val word = readln()
//        if(!list.contains(word)) list.add(word)
        list.add(readln())
    }

    list.sortedWith(compareBy({it.count()}, {it})).distinct().forEach {
        println(it)
    }
}