fun main(args: Array<String>) {
    question16727()
}

fun question16727() {
    val perHome = readln().split(" ").map { it.toInt() }
    val estHome = readln().split(" ").map { it.toInt() }

    val totalScore = listOf(perHome[0] + estHome[1], perHome[1] + estHome[0])
    if(totalScore[0] > totalScore[1]) {
        println("Persepolis")
    } else if(totalScore[1] > totalScore[0]) {
        println("Esteghlal")
    } else {
        if(perHome[1] > estHome[1]) {
            println("Esteghlal")
        } else if (perHome[1] < estHome[1]) {
            println("Persepolis")
        } else {
            println("Penalty")
        }
    }
}