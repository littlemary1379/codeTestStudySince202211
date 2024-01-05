fun main(args: Array<String>) {
    question9063()
}

fun question9063() {

    val dot = readln().toInt()

    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()

    for(i in 0..< dot) {
        val location = readln().split(" ").map { it.toInt() }
        xList.add(location[0])
        yList.add(location[1])
    }

    println("${((xList.max() - xList.min()) * (yList.max() - yList.min()))}")
}