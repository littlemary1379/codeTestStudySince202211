fun main(args: Array<String>) {
    question28235()
}

fun question28235() {
    val sentense = readln()
    println(when(sentense) {
        "SONGDO" -> "HIGHSCHOOL"
        "CODE" -> "MASTER"
        "2023" -> "0611"
        "ALGORITHM" -> "CONTEST"
        else -> ""
    })
}