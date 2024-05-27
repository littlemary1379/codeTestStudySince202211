import java.text.DecimalFormat

fun main(args: Array<String>) {
    question26530()
}

fun question26530() {
    val case = readln().toInt()
    for(i in 1 .. case) {
        val products = readln().toInt()
        var prices = 0.0
        for(j in 1 ..products) {
            readln().split(" ").let {
                prices += (it[2].toDouble() * it[1].toDouble())
            }
        }
        val format = DecimalFormat("#.00")
        println("$${format.format(prices)}")
    }
}