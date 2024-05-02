fun main(args: Array<String>) {
    question27959()
}

fun question27959() {
    val coins = readln().split(" ").map { it.toInt() }
    println(if(((coins[0] * 100) / coins[1]) > 0) "Yes" else "No")
}