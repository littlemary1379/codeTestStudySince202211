fun main(args: Array<String>) {
    question15232()
}

fun question15232() {
    val height = readln().toInt()
    val width = readln().toInt()

    for(i in 1.. height) {
        println("*".repeat(width))
    }
}