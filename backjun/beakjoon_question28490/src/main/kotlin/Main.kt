fun main(args: Array<String>) {
    question28490()
}

fun question28490() {
    val count = readln().toInt()
    var frame = 0
    for(i in 1 .. count) {
        readln().split(" ").map { it.toInt() }.let {
            if(frame < it[0] * it[1]) {
                frame = it[0] * it[1]
            }
        }
    }
    println(frame)
}