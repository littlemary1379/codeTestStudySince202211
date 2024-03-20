import java.lang.StringBuilder

fun main(args: Array<String>) {
    question18870()
}

fun question18870() {
    val count = readln().toInt()
    val position = readln().split(" ").map { it.toInt() }
    val sortMap = position.sorted()

    val map = HashMap<Int, Int>()
    var rank = 0

    sortMap.forEach {
        if(!map.containsKey(it)) {
            map[it] = rank
            rank++
        }
    }

    val sb = StringBuilder()
    position.forEach {
        sb.append("${map[it]} ")
    }

    println(sb)

}

//fun question18870() {
//    val count = readln().toInt()
//    val position = readln().split(" ").map { it.toInt() }
//    val distinctPosition = position.distinct()
//
//    val sb = StringBuilder()
//
//    position.forEachIndexed { index, i ->
//        sb.append("${distinctPosition.count { it < i }} ")
//    }
//
//    println(sb.toString().trim())
//
//}