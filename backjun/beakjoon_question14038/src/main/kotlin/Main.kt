fun main(args: Array<String>) {
    question14038()
}

fun question14038() {
    var count = 0
    for (i in 1..6) {
        if (readln() == "W") {
            count += 1
        }
    }
    println(
        when (count) {
            in 5..6 -> "1"
            in 3..4 -> "2"
            in 1..2 -> "3"
            else -> "-1"
        }
    )
}