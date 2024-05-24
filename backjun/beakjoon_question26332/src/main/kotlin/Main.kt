fun main(args: Array<String>) {
    question26332()
}

fun question26332() {
    val count = readln().trim().toInt()
    for (i in 1 .. count) {
        val parchase = readln().trim().split(" ").map { it.toInt() }
        println(parchase.joinToString(" "))
        if(parchase[0] == 1) {
            println(parchase[1])
        } else {
            println(parchase[1] + (parchase[0] - 1) * (parchase[1] - 2))
        }
    }
}