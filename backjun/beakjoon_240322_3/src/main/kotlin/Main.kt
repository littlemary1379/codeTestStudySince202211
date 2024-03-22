fun main(args: Array<String>) {
    question1764()
}

fun question1764() {
    val count = readln().split(" ").map { it.toInt() }
    val userList = hashMapOf<String, Int>()

    // 듣도 못한 사람
    for(i in 0 ..< count[0]) {
        userList[readln()] = 1
    }

    // 보도못한 사람
    for(i in 0 ..< count[1]) {
        val username = readln()
        if(userList.containsKey(username)) {
            userList[username] = userList[username]!! + 1
        }
    }

    val filter = userList.filter { it.value == 2  }.toSortedMap()
    println(filter.size)
    filter.forEach { (key, value) ->
        println(key)
    }
}