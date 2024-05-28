fun main(args: Array<String>) {
    question28249()
}

fun question28249() {
    val count = readln().toInt()
    var hot = 0
    for(i in 1 .. count) {
        hot += when(readln()) {
            "Poblano" -> 1500
            "Mirasol" -> 6000
            "Serrano" -> 15500
            "Cayenne" -> 40000
            "Thai" -> 75000
            "Habanero" -> 125000
            else -> 0
        }
    }
    println(hot)
}