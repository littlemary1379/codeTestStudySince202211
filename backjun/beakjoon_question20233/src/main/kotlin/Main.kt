fun main(args: Array<String>) {
    question20233()
}

fun question20233() {
    val aMonth = readln().toInt()
    val aMinute = readln().toInt()
    val bMonth = readln().toInt()
    val bMinute = readln().toInt()
    val totalMinute = readln().toInt()

    val totalA = aMonth + if(totalMinute > 30) {
        (totalMinute - 30) * aMinute * 21
    } else {
        0
    }
    val totalB = bMonth + if(totalMinute > 45) {
        (totalMinute - 45) * bMinute * 21
    } else {
        0
    }
    println("$totalA $totalB")
}