import java.lang.Exception

fun main(args: Array<String>) {
    question1620()
}

fun question1620() {
    val count = readln().split(" ").map { it.toInt() }
    val listKey = hashMapOf<Int, String>()
    val listName = hashMapOf<String, Int>()
    for(i in 0 ..< count[0] ) {
        val name = readln()
        listKey[i + 1] = name
        listName[name] = i + 1
    }

    val stringBuilder = StringBuilder()

    for(i in 0 ..< count[1]) {
        val question = readln()
        try {
            val questionInt = question.toInt()
            stringBuilder.append(listKey[questionInt])
        } catch (_: Exception) {
            stringBuilder.append(listName[question])
        }
        stringBuilder.append("\n")
    }

    println(stringBuilder.toString())

}
