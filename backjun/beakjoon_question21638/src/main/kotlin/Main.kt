fun main(args: Array<String>) {
    question21638()
}

fun question21638() {
    val today = readln().split(" ").map { it.toInt() }
    val tomorrow = readln().split(" ").map { it.toInt() }

    println(if(tomorrow[0] < 0 && tomorrow[1] >= 10) {
        "A storm warning for tomorrow! Be careful and stay home if possible!"
    } else if(today[0] > tomorrow[0]) {
        "MCHS warns! Low temperature is expected tomorrow."
    } else if(today[1] < tomorrow[1]) {
        "MCHS warns! Strong wind is expected tomorrow."
    } else {
        "No message"
    })
}