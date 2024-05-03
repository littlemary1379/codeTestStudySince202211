fun main(args: Array<String>) {
    question5543()
}

fun question5543() {
    val hamburger = Array(3) { 0 }
    val drink = Array(2) { 0 }

    for(i in 0 .. 2) {
        hamburger[i] = readln().toInt()
    }

    for(i in 0 .. 1) {
        drink[i] = readln().toInt()
    }

    println("${hamburger.min() + drink.min() - 50}")
}