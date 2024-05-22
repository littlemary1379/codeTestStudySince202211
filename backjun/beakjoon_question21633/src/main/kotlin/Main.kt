import java.math.BigDecimal
import java.text.DecimalFormat

fun main(args: Array<String>) {
    question21633()
}

fun question21633() {
    val price = readln().toDouble()
    val leftPrice = 25 + price / 100
    val format = DecimalFormat("#.00")
    println(if(leftPrice <= 100) {
        "100.00"
    } else if(leftPrice >= 2000) {
        "2000.00"
    } else {
        format.format(leftPrice)
    })
}