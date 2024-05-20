fun main(args: Array<String>) {
    question17010()
}

fun question17010() {
    val case = readln().toInt()
    for(i in 1 .. case) {
        val line = readln().split(" ")
        println(line[1].repeat(line[0].toInt()))
    }
}