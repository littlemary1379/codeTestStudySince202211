fun main(args: Array<String>) {
    question14916()
}

fun question14916() {
    val price = readln().toInt()

    var coin5 = price / 5

    while (coin5 != -1) {
        val leftPrice = price - (coin5 * 5)
        if(leftPrice % 2 == 0) {
            println("${coin5 + (leftPrice / 2)}")
            break
        } else {
            coin5 -= 1
        }
    }

    if(coin5 == -1) {
        println("-1")
    }
}