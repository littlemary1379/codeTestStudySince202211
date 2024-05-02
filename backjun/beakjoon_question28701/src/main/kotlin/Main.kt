import kotlin.math.pow

fun main(args: Array<String>) {
    question28701()
}

fun question28701() {
    val number = readln().toInt()

    var add = 0
    var tripleSqrt = 0

    for(i in 1 ..number) {
        add += i
        tripleSqrt += i.toDouble().pow(3).toInt()
    }

    println(add)
    println(add.toDouble().pow(2).toInt())
    println(tripleSqrt)
}