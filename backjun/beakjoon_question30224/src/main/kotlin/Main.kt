fun main(args: Array<String>) {
    question30224()
}

fun question30224() {
    val number = readln()

    if(number.contains("7")) {
        println(if(number.toLong() % 7 == 0L) "3" else "2")

    } else {
        println(if(number.toLong() % 7 == 0L) "1" else "0")
    }
}