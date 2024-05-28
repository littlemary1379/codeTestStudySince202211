fun main(args: Array<String>) {
    question30791()
}

fun question30791() {
    readln().split(" ").map { it.toInt() }.let {
        println((it.count { vote -> (it[0] - 1000) <= vote}) - 1)
    }
}