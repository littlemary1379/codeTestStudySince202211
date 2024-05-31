fun main(args: Array<String>) {
    question2010()
}

fun question2010() {
    val count = readln().toInt()
    var electric = 0
    for(i in 1 ..count) electric += (readln().toInt() - 1)
    println(electric + 1)
}