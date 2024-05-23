fun main(args: Array<String>) {
    question25784()
}

fun question25784() {
    val num = readln().split(" ").map { it.toInt() }

    for(i in 0 .. 2) {
        num.filterIndexed { index, data -> index != i  }.let {
            if(it[0] + it[1] == num[i]) {
                println("1")
                return
            } else if(it[0] * it[1] == num[i]) {
                println("2")
                return
            }
        }
    }

    println("3")
}