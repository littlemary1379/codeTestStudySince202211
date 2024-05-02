fun main(args: Array<String>) {
    question29863()
}

fun question29863() {
    var period = 0
    var firstTime = readln().toInt()
    if(firstTime >= 20) {
        period += 24 - firstTime
        firstTime = 0
    }

    val lastTime = readln().toInt()
    println(lastTime - firstTime + period)
}