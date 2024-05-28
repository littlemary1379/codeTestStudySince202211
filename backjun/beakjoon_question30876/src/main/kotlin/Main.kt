fun main(args: Array<String>) {
    question30876()
}

fun question30876() {
    val count = readln().toInt()
    var minStation : List<Int>? = null
    for(i in 1 .. count) {
        if(minStation == null) {
            minStation = readln().split(" ").map { it.toInt() }
        } else {
            readln().split(" ").map { it.toInt() }.let {
                if(minStation!![1] > it[1]) {
                    minStation = it
                }
            }
        }
    }

    println(minStation?.joinToString(" "))
}