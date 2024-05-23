fun main(args: Array<String>) {
    question25628()
}

fun question25628() {
    readln().split(" ").map { it.toInt() }.let {
        if(it[0] / 2 > it[1]) {
            println(it[1])
        } else {
            println(it[0] / 2)
        }
    }
}