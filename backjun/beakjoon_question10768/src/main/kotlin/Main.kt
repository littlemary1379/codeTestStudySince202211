fun main(args: Array<String>) {
    question10768()
}

fun question10768() {
    val special = listOf(2, 18)
    val today = mutableListOf<Int>()

    for (i in 1..special.size) {
        today.add(i - 1, readln().toInt())
    }

    if(today[0] < special[0] || (today[0] == special[0] && today[1] < special[1])) {
        println("Before")
    } else if(today[0] == special[0] && today[1] == special[1]) {
        println("Special")
    } else {
        println("After")
    }
}