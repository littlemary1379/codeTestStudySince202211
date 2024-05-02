fun main(args: Array<String>) {
    question31429()
}

fun question31429() {
    val score = arrayOf(
        arrayOf(12, 1600),
        arrayOf(11, 894), arrayOf(11, 1327),
        arrayOf(10, 1311),
        arrayOf(9, 1004), arrayOf(9, 1178), arrayOf(9, 1357),
        arrayOf(8, 837),
        arrayOf(7, 1055),
        arrayOf(6, 556), arrayOf(6, 773)
    )

    val price = readln().toInt()
    println(score[price - 1].joinToString(" "))
}