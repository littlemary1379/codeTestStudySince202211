fun main(args: Array<String>) {
    question18198()
}

fun question18198() {
    val scores = readln().chunked(2)
    var aScore = 0
    var bScore = 0

    scores.forEach {
        if(it[0] == 'A') {
            aScore += it[1].toString().toInt()
        } else {
            bScore += it[1].toString().toInt()
        }
    }

    println(if(aScore > bScore) {
        "A"
    } else {
        "B"
    })
}