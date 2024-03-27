import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question1929()
}

fun question1929() {
    val count = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    iLoop@ for (i in count[0] .. count[1]) {
        if(i == 1) continue
        val sqrt = floor(sqrt(i.toDouble()))
        if(sqrt < 2) {
            list.add(i)
        } else {
            for(j in 2 .. sqrt.toInt()) {
                if(i % j == 0) {
                    continue@iLoop
                }
            }

            list.add(i)
        }
    }

    println(list.joinToString("\n"))
}