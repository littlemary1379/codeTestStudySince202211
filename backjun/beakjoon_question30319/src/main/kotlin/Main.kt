fun main(args: Array<String>) {
    question30319()
}

fun question30319() {
    readln().split("-").map { it.toInt() }.let {
        if(it[1] > 9 || (it[1] == 9 && it[2] > 16)) {
            println("TOO LATE")
        } else {
            println("GOOD")
        }
    }
}