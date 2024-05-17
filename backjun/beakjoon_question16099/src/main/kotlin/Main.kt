import kotlin.math.max

fun main(args: Array<String>) {
    question16099()
}

fun question16099() {
    val count = readln().trim().toInt()
    for (i in 1 .. count) {
        var length = readln().trim().split(" ").map { it.toDouble() }
        val telecom = length[0] * length[1]
        val eurecom = length[2] * length[3]

        println(
            when (telecom) {
                eurecom -> {
                    "Tie"
                }
                max(telecom, eurecom) -> {
                    "TelecomParisTech"
                }
                else -> {
                    "Eurecom"
                }
            }
        )
    }
}