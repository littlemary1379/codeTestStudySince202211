fun main(args: Array<String>) {
    question21612()
}

fun question21612() {
    val temp = readln().toInt()
    val pa = 5 * temp - 400

    println(pa)
    println(if(pa < 100) {
        1
    } else if(pa == 100) {
        0
    } else {
        -1
    })
}