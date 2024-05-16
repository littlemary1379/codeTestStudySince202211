fun main(args: Array<String>) {
    question15026()
}

fun question15026() {
    val bulls = readln().split(" ").map { it.toInt() }
    if(bulls[0] == 0 && bulls[1] == 0) {
        println("Not a moose")
    } else if (bulls[0] == bulls[1]) {
        println("Even ${bulls[0] * 2}")
    } else {
        println("Odd ${bulls.max() * 2}")
    }
}