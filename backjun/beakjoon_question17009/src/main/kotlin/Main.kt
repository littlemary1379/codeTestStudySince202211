fun main(args: Array<String>) {
    question17009()
}

fun question17009() {
    var appleScore = 0
    for(i in 1 .. 3) {
        appleScore += readln().toInt() * (4 - i)
    }

    var bananaScore = 0
    for(i in 1 .. 3) {
        bananaScore += readln().toInt() * (4 - i)
    }

    println(if(appleScore > bananaScore) {
        "A"
    } else if(appleScore < bananaScore) {
        "B"
    } else {
        "T"
    })
}