fun main(args: Array<String>) {
    question10815()
}

fun question10815() {
    val sanggunCount = readln().toInt()
    val sanggunCard = readln().split(" ").toHashSet()
    val yourCount = readln().toInt()
    val yourCard = readln().split(" ")

    val stringBuilder = StringBuilder()
    yourCard.forEach {
        val count = if(sanggunCard.contains(it)) "1" else "0"
        stringBuilder.append("$count ")
    }

    println(stringBuilder.toString().trim())
}