fun main(args: Array<String>) {
    question16017()
}

fun question16017() {
    val first = readln()
    val second = readln()
    val third = readln()
    val fourth = readln()

    println(
        if ((first == "8" || first == "9")
            && (fourth == "8" || fourth == "9")
            && (second == third)
        ) {
            "ignore"
        } else {
            "answer"
        }
    )
}