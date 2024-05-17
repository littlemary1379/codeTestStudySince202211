fun main(args: Array<String>) {
    question16199()
}

fun question16199() {
    val birth = readln().split(" ").map { it.toInt() }
    val today = readln().split(" ").map { it.toInt() }

    val manOld = if(today[1] > birth[1] || (today[1] == birth[1] && today[2] >= birth[2])) {
        today[0] - birth[0]
    } else {
        today[0] - birth[0] - 1
    }
    val checkOld = today[0] - birth[0] + 1
    val yearOld = today[0] - birth[0]

    println(manOld)
    println(checkOld)
    println(yearOld)
}