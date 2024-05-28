fun main(args: Array<String>) {
    question27890()
}

fun question27890() {
    readln().split(" ").map { it.toInt() }.toMutableList().let {
        for(i in 1 .. it[1]) {
            if(it[0] % 2 == 0) {
                it[0] = (it[0] / 2) xor 6
            } else {
                it[0] = (2 * it[0]) xor 6
            }
        }
        println(it[0])
    }
}