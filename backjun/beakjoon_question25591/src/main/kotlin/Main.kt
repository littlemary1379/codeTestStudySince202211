fun main(args: Array<String>) {
    question25591()
}

fun question25591() {
    val numbers = readln().split(" ").map { it.toInt() }
    val a = 100 - numbers[0]
    val b = 100 - numbers[1]
    val c = 100 - (a + b)
    val d = a * b
    val q = d / 100
    val r = d % 100

    println("$a $b $c $d $q $r")
    println("${c + q} ${r}")
}