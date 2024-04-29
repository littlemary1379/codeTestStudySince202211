import kotlin.math.ceil

fun main(args: Array<String>) {
    question15727()
}

fun question15727() {
    val far = readln().toDouble()
    println(ceil(far / 5).toInt())
}