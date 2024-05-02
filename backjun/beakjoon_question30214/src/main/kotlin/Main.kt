fun main(args: Array<String>) {
    question30214()
}

fun question30214() {
    val score = readln().split(" ").map { it.toInt() }
    println(if(score[0] * 2 >= score[1]) "E" else "H")
}