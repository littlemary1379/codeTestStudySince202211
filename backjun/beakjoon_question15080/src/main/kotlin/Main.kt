import kotlin.math.pow

fun main(args: Array<String>) {
    question15080()
}

fun question15080() {
    val startTime = readln().split(" : ").map { it.toInt() }
    val endTime = readln().split(" : ").map { it.toInt() }.toMutableList()

    var second = 0
    for (i in 2 downTo 0) {
        if (startTime[i] > endTime[i]) {
            if(i == 0) {
                endTime[i] += 24
            } else {
                endTime[i - 1] -= 1
                endTime[i] += 60
            }
        }

        second += (endTime[i] - startTime[i]) * (60.0.pow((2 - i))).toInt()
    }

    println(second)

}