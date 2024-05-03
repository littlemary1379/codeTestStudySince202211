fun main(args: Array<String>) {
    question4562()
}

fun question4562() {
    val count = readln().toInt()
    for (i in 1 .. count) {
        val zombie = readln().split(" ").map { it.toInt() }
        println(if(zombie[0] >= zombie[1]) "MMM BRAINS" else "NO BRAINS")
    }
}