fun main(args: Array<String>) {
    question2530()
}

fun question2530() {
    val time = readln().split(" ").map { it.toInt() }.toMutableList()
    val meals = readln().toInt()

    time[2] += meals

    for(i in 2 downTo 0) {
        val limit = when (i) {
            0 -> 24
            1 -> 60
            2 -> 60
            else -> 0
        }

        if(time[i] / limit > 0) {
            if(i != 0) {
                time[i - 1] += (time[i] / limit)
            }
            time[i] = time[i] % limit
        }

    }

    println(time.joinToString(" "))

}