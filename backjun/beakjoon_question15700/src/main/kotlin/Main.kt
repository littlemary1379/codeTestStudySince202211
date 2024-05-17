import kotlin.math.max

fun main(args: Array<String>) {
    question15700()
}

fun question15700() {
    // width, height
    val area = readln().split(" ").map { it.toLong() }

    val width2 = if(area[0] / 2 == 0L) {
        0
    } else {
        area[0] / 2 * area[1] + if(area[0] % 2 == 0L) {
            0
        } else {
            area[1] / 2
        }
    }

    val height2 = if(area[1] / 2 == 0L) {
        0
    } else {
        area[1] / 2 * area[0] + if(area[1] % 2 == 0L) {
            0
        } else {
            area[0] / 2
        }
    }

    println(max(width2, height2))
}