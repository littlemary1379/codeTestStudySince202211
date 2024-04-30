fun main(args: Array<String>) {
    question27433()
}

fun question27433() {
    val count = readln().toInt()
    var multi = 1L

    for(i in 1 .. count) {
        multi *= i
    }

    println(multi)
}