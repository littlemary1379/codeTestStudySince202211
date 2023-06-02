fun main(args: Array<String>) {
    question3003()
}

fun question3003() {
    var chess = arrayListOf<Int>(1, 1, 2, 2, 2, 8)
    var list = readLine()!!.split(" ").map { it.toInt() }

    var part = mutableListOf<Int>()

    chess.forEachIndexed { index, i ->
        part.add(i - list[index])
    }

    println(part.joinToString(" "))
}