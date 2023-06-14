fun main(args: Array<String>) {
    question10798()
}

fun question10798() {
    var wordList = mutableListOf<MutableList<Char>>()
    var verticalWord = ""
    var maxCount = 0

    for(i in 0 .. 4) {
        var list = readLine()!!.toCharArray().toMutableList()
        wordList.add(i, list)
        maxCount = maxCount.coerceAtLeast(list.count())
    }

    var index = 0
    while (index < maxCount) {
        wordList.forEach {
            if(it.count() > index) {
                verticalWord += it[index]
            }
        }
        index += 1
    }

    println(verticalWord)

}