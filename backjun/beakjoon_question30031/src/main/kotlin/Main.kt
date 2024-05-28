fun main(args: Array<String>) {
    question30031()
}

fun question30031() {
    val count = readln().toInt()
    var price = 0
    for(i in 1 .. count) {
        readln().split(" ").let {
            price += when(it[0]) {
                "136" -> 1000
                "142" -> 5000
                "148" -> 10000
                "154" -> 50000
                else -> 0
            }
        }
    }
    println(price)
}