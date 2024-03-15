fun main(args: Array<String>) {
    question10814()
}

fun question10814() {
    val count = readln().toInt()
    // Pair<name, age>
    val list = mutableListOf<Pair<String, Int>>()
    for (i in 0 ..< count) {
        var personInfo = readln().split(" ")
        list.add(Pair(personInfo[1], personInfo[0].toInt()))
    }

    list.sortedWith(compareBy { it.second }).forEach {
        println("${it.second} ${it.first}")
    }
}