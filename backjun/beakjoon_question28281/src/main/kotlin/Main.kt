fun main(args: Array<String>) {
    question28281()
}

fun question28281() {
    val birth = readln().split(" ").map { it.toInt() }
    val socks = readln().split(" ").map { it.toInt() }
    var minPrice = socks[0] + socks[1]
    for(i in 1 ..< birth[0]) {
        if(socks[i - 1] + socks[i] < minPrice) {
            minPrice = socks[i - 1] + socks[i]
        }
    }
    println(minPrice * birth[1])
}