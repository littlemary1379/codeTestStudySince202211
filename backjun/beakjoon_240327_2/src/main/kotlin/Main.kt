import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question4948()
}

fun question4948() {
    while (true) {
        var number = readln().toInt()
        if(number == 0) {
            break
        } else {
            var count = 0
            numberLoop@ for(i in number + 1 .. number * 2) {
                if(i == 1) continue
                val sqrt = floor(sqrt(i.toDouble())).toInt()
                for(j in 2 .. sqrt) {
                    if(i % j == 0) {
                        continue@numberLoop
                    }
                }
                count += 1
            }
            println(count)
        }
    }
}