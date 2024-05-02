fun main(args: Array<String>) {
    question28691()
}

fun question28691() {
    println(when(readln()) {
        "M" -> "MatKor"
        "W" -> "WiCys"
        "C" -> "CyKor"
        "A" -> "AlKor"
        "$" -> "\$clear"
        else -> ""
    })
}