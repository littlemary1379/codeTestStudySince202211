fun main(args: Array<String>) {
    question25600()
}

fun question25600() {
    val person = readln().toInt()
    val priceList = mutableListOf<Int>()

    for(i in 1 .. person) {
        priceList.add(readln().split(" ").map { it.toInt() }.let {
            it[0] * (it[1] + it[2]) * if (it[0] == (it[1] + it[2])) {
                2
            } else {
                1
            }
        })
    }

    println(priceList.max())
}