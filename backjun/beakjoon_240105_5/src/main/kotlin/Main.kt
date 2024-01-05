fun main(args: Array<String>) {
    question10101()
}

fun question10101() {
    var degrees = mutableListOf<Int>()

    for(i in 0..< 3) {
        val degree = readln().toInt()
        degrees.add(degree)
    }

    if(degrees.sum() != 180) {
        println("Error")
        return
    }

    val distinctDegree = degrees.distinct()

    when(distinctDegree.count()) {
        1 -> println("Equilateral")
        2 -> println("Isosceles")
        3 -> println("Scalene")
    }
}