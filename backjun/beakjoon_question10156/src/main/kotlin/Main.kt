fun main(args: Array<String>) {
    question10156()
}

fun question10156() {
    val prices = readln().split(" ").map { it.toInt() }
    print(
        if(prices[0] * prices[1] > prices[2]) "${(prices[0] * prices[1]) - prices[2]}" else "0"
    )
}