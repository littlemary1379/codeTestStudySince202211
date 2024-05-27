fun main(args: Array<String>) {
    question27590()
}

fun question27590() {
    val sun = readln().split(" ").map { it.toInt() }
    val moon = readln().split(" ").map { it.toInt() }

    var sunRound = 1
    sunLoop@ while (true) {

        val sunYear = sun[1] * sunRound - sun[0]
        var moonRound = 1

        moonLoop@ while (true) {
            val moonYear = moon[1] * moonRound - moon[0]
            if(sunYear == moonYear) {
                println(sunYear)
                break@sunLoop
            } else if(sunYear < moonYear) {
                break@moonLoop
            } else {
                moonRound++
            }
        }
       sunRound++
    }
}