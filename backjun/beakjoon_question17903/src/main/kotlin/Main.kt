fun main(args: Array<String>) {
    question17903()
}

fun question17903() {
    val case = readln().split(" ").map { it.toInt() }
    println(if(case[0] >= 8) {
        "satisfactory"
    } else {
        "unsatisfactory"
    })
}