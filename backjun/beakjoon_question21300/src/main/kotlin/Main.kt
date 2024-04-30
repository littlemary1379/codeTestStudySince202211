fun main(args: Array<String>) {
    question21300()
}

fun question21300() {
    val bottles = readln().split(" ").map { it.toInt() }
    var price = 0
    bottles.forEach {
        price += it * 5
    }

    println(price)
}