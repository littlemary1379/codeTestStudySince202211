fun main(args: Array<String>) {
    question19698()
}

fun question19698() {
    val cows = readln().split(" ").map { it.toInt() }
    if((cows[1] / cows[3]) * (cows[2] / cows[3]) >= cows[0]) {
        println(cows[0])
    } else {
        println((cows[1] / cows[3]) * (cows[2] / cows[3]))
    }
}