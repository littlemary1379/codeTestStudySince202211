fun main(args: Array<String>) {
    question9699()
}

fun question9699() {
    val case = readln().toInt()
    for (i in 1..case) {
        println("Case #$i: ${readln().split(" ").maxOfOrNull { it.toInt() }}")
    }
}