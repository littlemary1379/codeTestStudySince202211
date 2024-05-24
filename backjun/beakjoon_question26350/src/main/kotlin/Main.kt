fun main(args: Array<String>) {
    question26350()
}

fun question26350() {
    val case = readln().toInt()
    caseLoop@ for(i in 1 .. case) {
        val coins = readln().split(" ").map { it.toInt() }
        println("Denominations: ${coins.filterIndexed{ index, _ -> index != 0 }.joinToString(" ")}")
        for(i in 2 ..< coins.size) {
            if(coins[i - 1] * 2 > coins[i]) {
                println("Bad coin denominations!")
                println()
                continue@caseLoop
            }
        }
        println("Good coin denominations!")
        println()
    }
}