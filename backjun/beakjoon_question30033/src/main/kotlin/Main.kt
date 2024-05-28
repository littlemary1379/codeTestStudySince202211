fun main(args: Array<String>) {
    question30033()
}

fun question30033() {
    val count = readln().toInt()
    val plan = readln().split(" ").map { it.toInt() }
    val exe = readln().split(" ").map { it.toInt() }

    var success = 0
    for(i in 0 ..< count) {
        if(exe[i] >= plan[i]) {
            success++
        }
    }

    println(success)
}