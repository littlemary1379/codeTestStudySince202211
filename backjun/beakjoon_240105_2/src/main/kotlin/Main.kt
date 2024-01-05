fun main(args: Array<String>) {
    question3009()
}

fun question3009() {

    val listX = mutableListOf<Int>()
    val listY = mutableListOf<Int>()

    for(i in 0 .. 2) {
        val dot = readln().split(" ").map { it.toInt() }
        listX.add(dot[0])
        listY.add(dot[1])
    }

    val filterX = listX.filter { filter -> listX.count{it == filter} == 1 }
    val filterY = listY.filter { filter -> listY.count{it == filter} == 1 }
    println("${filterX[0]} ${filterY[0]}")
}