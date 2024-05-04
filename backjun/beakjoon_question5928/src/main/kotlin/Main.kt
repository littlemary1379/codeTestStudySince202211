fun main(args: Array<String>) {
    question5928()
}

fun question5928() {
    val time = readln().split(" ").map{ it.toInt() }

    val diffDay = time[0] - 11
    val diffHour = time[1] - 11
    val diffMin = time[2] - 11

    val diffTime = diffDay * 24 * 60 + diffHour * 60 + diffMin

    if(diffTime >= 0 ){
        println("$diffTime")
    } else {
        println("-1")
    }
}