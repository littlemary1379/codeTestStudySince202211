fun main(args: Array<String>) {
    question29738()
}

fun question29738() {
    val case = readln().toInt()
    for(i in 1 .. case) {
        val price = readln().toInt()
        when(price) {
            in 1 .. 25 -> println("Case #$i: World Finals")
            in 26 .. 1000 -> println("Case #$i: Round 3")
            in 1001 .. 4500 -> println("Case #$i: Round 2")
            else -> println("Case #$i: Round 1")
        }
    }
}