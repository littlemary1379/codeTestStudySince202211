fun main(args: Array<String>) {
    question25377()
}

fun question25377() {
    val count = readln().toInt()
    val times = mutableListOf<Int>()
    for(i in 1 .. count) {
        readln().split(" ").map { it.toInt() }.let {
            if(it[0] > it[1]) {
                times.add(-1)
            } else {
                times.add(it[1])
            }
        }
    }

    if(times.count { it == -1 } == count) {
        println("-1")
    } else {
        println(times.filter { it != -1 }.min())
    }
}