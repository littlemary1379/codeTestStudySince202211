fun main(args: Array<String>) {
    question25828()
}

fun question25828() {
    val covid = readln().split(" ").map { it.toInt() }
    val all = covid[1] * covid[0]
    val grouping = covid[0] + covid[2] * covid[1]

    println(if(all == grouping) {
        0
    } else if(all > grouping) {
        2
    } else {
        1
    })

}