fun main(args: Array<String>) {
    question24883()
}

fun question24883() {
    var keyword = readln()
    println(when (keyword) {
        "N", "n" -> "Naver D2"
        else -> "Naver Whale"
    })

}
