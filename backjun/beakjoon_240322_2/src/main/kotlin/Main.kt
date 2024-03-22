import java.lang.StringBuilder

fun main(args: Array<String>) {
    question10816()
}

fun question10816() {
    val count = readln().toInt()
    val sanggunList = readln().split(" ").map { it.toInt() }
    val sanggunMap = hashMapOf<Int, Int>()
    val cardCount = readln().toInt()
    val cardList = readln().split(" ").map { it.toInt() }

    sanggunList.forEach {
        sanggunMap[it] = sanggunMap.getOrDefault(it, 0) + 1
    }

    val sb = StringBuilder()
    cardList.forEach {
        sb.append("${sanggunMap.getOrDefault(it, 0)} ")
    }

    println(sb.toString().trim())
}