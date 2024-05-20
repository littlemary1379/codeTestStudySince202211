fun main(args: Array<String>) {
    question17388()
}

fun question17388() {
    val participant = readln().split(" ").map { it.toInt() }
    if(participant.sum() >= 100) {
        println("OK")
    } else {
        when(participant.indexOf(participant.min())) {
            0 -> println("Soongsil")
            1 -> println("Korea")
            2 -> println("Hanyang")
        }
    }
}