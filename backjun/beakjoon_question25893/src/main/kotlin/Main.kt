fun main(args: Array<String>) {
    question25893()
}

fun question25893() {
    val count = readln().toInt()
    for (i in 1 .. count) {
        readln().split(" ").map { it.toInt() }.let {
            println(it.joinToString(" "))
            when(it.count{ it >= 10} ) {
                0 -> println("zilch")
                1 -> println("double")
                2 -> println("double-double")
                3 -> println("triple-double")
            }
        }
        println()
    }
}