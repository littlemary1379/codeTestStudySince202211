import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    question16693()
}

fun question16693() {
    val slicePizza = readln().trim().split(" ").map{ it.toDouble() }
    val wholePizza = readln().trim().split(" ").map { it.toDouble() }

    val wholePizzaArea = wholePizza[0].pow(2) * PI

    println(if(slicePizza[1] / slicePizza[0] > wholePizza[1] / wholePizzaArea) {
        "Whole pizza"
    } else {
        "Slice of pizza"
    })
}