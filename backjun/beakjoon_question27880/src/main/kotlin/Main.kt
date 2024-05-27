fun main(args: Array<String>) {
    question27880()
}

fun question27880() {
    var length = 0
    while (true) {
        val under = readlnOrNull()
        if(under.isNullOrEmpty()) {
            break
        } else {
            under.split(" ").let {
                length += if(it[0] == "Es") {
                    21 * it[1].toInt()
                } else {
                    17 * it[1].toInt()
                }
            }
        }
    }
    println(length)
}