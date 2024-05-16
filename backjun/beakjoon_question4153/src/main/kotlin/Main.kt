import kotlin.math.pow

fun main(args: Array<String>) {
    question4153()
}

fun question4153() {
    while(true) {
        val triangle = readln()
        if(triangle == "0 0 0") {
            break
        } else {
            val triangleInt = triangle.split(" ").map { it.toDouble() }.sorted()
            if(triangleInt[0].pow(2.0) + triangleInt[1].pow(2.0) == triangleInt[2].pow(2.0)) {
                println("right")
            } else {
                println("wrong")
            }
        }
    }
}