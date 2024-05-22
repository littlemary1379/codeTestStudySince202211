import kotlin.math.min

fun main(args: Array<String>) {
    question25192()
}

fun question25192() {
    val chicken = readln().toInt()
    val drink = readln().split(" ").map { it.toInt() }

    val canChicken = (drink[0] / 2) + (drink[1])

    println(min(chicken, canChicken))
}