fun main(args: Array<String>) {
    question28295()
}

fun question28295() {
    // 왼쪽으로 도는걸 +, 오른쪽으로 도는걸 -로 판단
    var location = 0
    for (i in 1 .. 10) {
        val readln = readln()
        when(readln) {
            "1" -> location -= 90
            "2" -> location += 180
            "3" -> location += 90
        }
    }

    while (location < 0) {
        location += 360
    }

    println(when(location % 360) {
        90 -> "W"
        180 -> "S"
        270 -> "E"
        0 -> "N"
        else -> ""
    })
}