fun main(args: Array<String>) {
    question27294()
}

fun question27294() {
    val case = readln().split(" ").map { it.toInt() }
    println(
        if ((case[0] in 12..16) && case[1] == 0) {
            "320"
        } else {
            "280"
        }
    )
}