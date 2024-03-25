fun main(args: Array<String>) {
    question11478()
    // ex : ababc answer : 12
}

fun question11478() {
    val string = readln()
    val partStringList = HashSet<String>()
    for(i in 1 .. string.count()) {
        for (j in 0 .. string.count() - i) {
            partStringList.add(string.substring(j, j+i))
        }
    }

    println(partStringList.count())
}