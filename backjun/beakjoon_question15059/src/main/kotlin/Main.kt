fun main(args: Array<String>) {
    question15059()
}

fun question15059() {
    val airplane = readln().split(" ").map { it.toInt() }
    val people = readln().split(" ").map { it.toInt() }

    var lack = 0
    for(i in airplane.indices) {
        if (airplane[i] < people[i]) {
            lack += people[i] - airplane[i]
        }
    }

    println(lack)
}