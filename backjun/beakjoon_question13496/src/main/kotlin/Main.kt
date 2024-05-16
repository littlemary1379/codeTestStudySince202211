fun main(args: Array<String>) {
    question13496()
}

fun question13496() {
    val case = readln().toInt()
    for(i in 1 .. case) {
        val ships = readln().split(" ").map { it.toInt() }
        var shipDucat = 0
        for(j in 1 .. ships[0]) {
            val ship = readln().split(" ").map { it.toDouble() }
            if(ship[0] / ships[1] <= ships[2]) {
                shipDucat += ship[1].toInt()
            }
        }
        println("Data Set $i:")
        println(shipDucat)
        println()
    }
}