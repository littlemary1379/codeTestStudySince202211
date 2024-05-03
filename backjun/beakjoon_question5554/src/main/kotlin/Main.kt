fun main(args: Array<String>) {
    question5554()
}

fun question5554() {
    var sum = 0
    for (i in 1 .. 4) {
        sum += readln().toInt()
    }

    println(sum / 60)
    println(sum - ((sum / 60) * 60))
}