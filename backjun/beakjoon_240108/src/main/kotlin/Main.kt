fun main(args: Array<String>) {
    question5073()
}

fun question5073() {
    while (true) {
        var line = readln().split(" ").map { it.toInt() }

        if(line.sum() == 0) {
            break
        }

        if(line.sum() <= line.max() * 2) {
            println("Invalid")
        } else {
            when(line.distinct().count()) {
                1 -> println("Equilateral")
                2 -> println("Isosceles")
                3 -> println("Scalene")
            }
        }

    }
}