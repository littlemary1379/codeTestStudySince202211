fun main(args: Array<String>) {
    question11948()
}

fun question11948() {
    val science = mutableListOf<Int>()
    val society = mutableListOf<Int>()
    for(i in 1 .. 4) {
        science.add(readln().toInt())
    }

    for(i in 1 .. 2) {
        society.add(readln().toInt())
    }

    science.sortDescending()
    science.removeLast()
    println("${science.sum() + society.max()}")
}