fun main(args: Array<String>) {
    question11047()
}

fun question11047() {
    val count = readln().split(" ").map { it.toInt() }
    val coins = mutableListOf<Int>()

    for(i in 1 .. count[0]) {
        coins.add(readln().toInt())
    }

    coins.sortDescending()

    var coinCount = 0
    var calCount = count[1]

    coins.forEach {
        if(calCount / it > 0) {
            coinCount += (calCount / it)
            calCount %= it
        }
    }

    println(coinCount)
}