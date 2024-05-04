fun main(args: Array<String>) {
    question27889()
}

fun question27889() {
    val name = readln()
    println(when(name) {
        "NLCS" -> "North London Collegiate School"
        "BHA" -> "Branksome Hall Asia"
        "KIS" -> "Korea International School"
        "SJA" -> "St. Johnsbury Academy"
        else -> ""
    })
}