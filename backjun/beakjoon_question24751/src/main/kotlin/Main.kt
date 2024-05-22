import java.math.BigDecimal
import java.text.DecimalFormat

fun main(args: Array<String>) {
    question24751()
}

fun question24751() {
    val aBeating = readln().toDouble()
    val formatter = DecimalFormat("#.0000000000")
    println(formatter.format(100 / aBeating))
    println(formatter.format(100 / (100 - aBeating)))
}