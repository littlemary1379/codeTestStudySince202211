fun main(args: Array<String>) {
    question9772()
}

fun question9772() {
    while (true) {
        val coordinates = readln()
        if(coordinates == "0 0") {
            println("AXIS")
            break
        } else if(coordinates.split(" ").count { it == "0" } == 1) {
            println("AXIS")
        } else {
            val coorInt = coordinates.trim().split(" ").map{ it.toDouble() }
            when {
                coorInt[0] > 0 && coorInt[1] > 0 -> { println("Q1") }
                coorInt[0] < 0 && coorInt[1] > 0 -> { println("Q2") }
                coorInt[0] < 0 && coorInt[1] < 0 -> { println("Q3") }
                coorInt[0] > 0 && coorInt[1] < 0 -> { println("Q4") }

            }
        }
    }
}