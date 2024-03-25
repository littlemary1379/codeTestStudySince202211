
fun main(args: Array<String>) {
    question1269()
}

fun question1269() {
    val count = readln().split(" ")
    val aList = readln().split(" ").map { it.toInt() }.toHashSet()
    val bList = readln().split(" ").map { it.toInt() }.toHashSet()

    println(aList.minus(bList).count() + bList.minus(aList).count())
}