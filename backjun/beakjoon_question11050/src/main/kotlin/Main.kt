fun main(args: Array<String>) {
    question11050()
}

fun question11050() {
    val number = readln().split(" ").map { it.toInt() }
    var upper = 1
    for (i in (number[1] + 1)..number[0]) {
        upper *= i
    }
    var under = 1
    for (i in 1 .. (number[0] - number[1])) {
        under *= i
    }

    println(upper / under)

}