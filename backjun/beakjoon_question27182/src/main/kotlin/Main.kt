fun main(args: Array<String>) {
    question27182()
}

fun question27182() {
    readln().split(" ").map { it.toInt() }.let {
        val today = it[0] - 7
        val last = it[1] + 7

        listOf(28, 29, 30, 31).forEach { lastDay ->
            if(today <= 0) {
                if(today + lastDay == last) {
                    println(last)
                    return
                }
            } else if(last >= lastDay){
                if(today == last - lastDay) {
                    println(today)
                    return
                }
            }
        }

        println(it[1] + 7)
    }
}