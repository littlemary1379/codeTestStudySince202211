fun main(args: Array<String>) {
    question30868()
}

fun question30868() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        readln().toInt().let {
            println("${"++++ ".repeat(it / 5)}${"|".repeat(it % 5)}")
        }
    }
}