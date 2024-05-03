fun main(args: Array<String>) {
    question5575()
}

fun question5575() {
    for(i in 1 .. 3) {
        val time = readln().split(" ").map { it.toInt() }
        var period = (time[3] * 60 * 60 + time[4] * 60 + time[5]) - (time[0] * 60 * 60 + time[1] * 60 + time[2])

        val hour = period / 3600
        period -= (period / 3600) * 3600
        val minute = period / 60
        period -= (period / 60) * 60

        println("$hour $minute $period")

    }
}