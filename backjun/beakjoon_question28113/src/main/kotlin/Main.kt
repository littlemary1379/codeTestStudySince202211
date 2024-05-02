fun main(args: Array<String>) {
    question28113()
}

fun question28113() {
    // 걸어가는 시간, 버스, 지하철
    val times = readln().split(" ").map { it.toInt() }

    if(times[1] < times[2] || times[0] > times[2]) {
        println("Bus")
    } else if(times[1] == times[2]) {
        println("Anything")
    } else {
        println("Subway")
    }
}