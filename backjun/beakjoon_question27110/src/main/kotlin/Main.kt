fun main(args: Array<String>) {
    question27110()
}

fun question27110() {
    val chickens = readln().toInt()
    readln().split(" ").map { it.toInt() }.let {
        val chicken = (if(it[0] > chickens) chickens else it[0]) + (if(it[1] > chickens) chickens else it[1]) + (if(it[2] > chickens) chickens else it[2])
        println(chicken)
    }
}