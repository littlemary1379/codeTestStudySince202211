fun main(args: Array<String>) {
    question7785()
}

fun question7785() {
    val count = readln().toInt()
    // 0 : 없음, 1 : 있음
    val person = hashMapOf<String, Int>()
    for(i in 0 ..< count) {
        val status = readln().split(" ")
        person[status[0]] = if(status[1] == "enter") 1 else 0
    }

    val stringBuilder = StringBuilder()

    person.filter { it.value == 1 }.toSortedMap(compareBy<String> {it}.reversed()).forEach { key, value ->
        stringBuilder.append("$key\n")
    }

    println(stringBuilder.toString())
}