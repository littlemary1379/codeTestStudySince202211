fun main(args: Array<String>) {
    question24736()
}

fun question24736() {
    val visiting = readln().split(" ").map { it.toInt() }
    val home = readln(). split(" ").map { it.toInt() }
    val stringBuilder = StringBuilder()

    for (i in 1 .. 2) {
        var count = 0
        val team = if(i == 1) visiting else home
        for(j in visiting.indices) {
            when(j) {
                0 -> count += team[0] * 6
                1 -> count += team[1] * 3
                2 -> count += team[2] * 2
                3 -> count += team[3] * 1
                4 -> count += team[4] * 2
                else -> Unit
            }
        }
        stringBuilder.append("$count ")
    }

    println(stringBuilder.trim())

}