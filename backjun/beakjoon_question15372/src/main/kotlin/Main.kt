fun main(args: Array<String>) {
    question15372()
}

fun question15372() {
    val case = readln().toInt()
    for(i in 1 ..case) {
        val number = readln().toLong()
        println(number * number)
    }
}