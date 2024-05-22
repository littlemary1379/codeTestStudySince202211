fun main(args: Array<String>) {
    question23795()
}

fun question23795() {
    var removeAll = 0L
    while (true) {
        val coin = readln().toLong()
        if(coin == -1L) {
            break
        } else {
            removeAll += coin
        }
    }

    println(removeAll)
}