fun main(args: Array<String>) {
    question14425()
}

fun question14425() {
    val count = readln().split(" ").map { it.toInt() }
    val wordList = mutableListOf<String>()
    val searchList = hashMapOf<String, Int>()
    for (i in 0..<count[0]) {
        wordList.add(readln())
    }

    for (i in count[0]..<(count[0] + count[1])) {
        val key = readln()
        if (searchList.containsKey(key)) {
            searchList[key] = searchList.getValue(key) + 1
        } else {
            searchList[key] = 1
        }
    }

    var containCount = 0
    wordList.forEach {
        if (searchList.containsKey(it)) {
            containCount += searchList[it]!!
        }
    }

    println(containCount)

}