fun main(args: Array<String>) {
    question30794()
}

fun question30794() {
    readln().split(" ").let {
        println(when(it[1]) {
            "miss" -> 0
            "bad" -> 200 * it[0].toInt()
            "cool" -> 400 * it[0].toInt()
            "great" -> 600 * it[0].toInt()
            "perfect" -> 1000 * it[0].toInt()
            else -> 0
        })
    }
}