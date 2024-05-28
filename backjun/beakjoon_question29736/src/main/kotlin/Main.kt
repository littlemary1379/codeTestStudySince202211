fun main(args: Array<String>) {
    question29736()
}

fun question29736() {
    val user = readln().split(" ").map { it.toInt() }
    readln().split(" ").map { it.toInt() }.let {
        var underScore = it[0] - it[1]
        var upperScore = it[0] + it[1]

        if(underScore < user[0]) {
            underScore = user[0]
        }

        if(upperScore > user[1]) {
            upperScore = user[1]
        }

        val friend = upperScore - underScore + 1
        println(if(friend < 1) "IMPOSSIBLE" else friend)

    }

}