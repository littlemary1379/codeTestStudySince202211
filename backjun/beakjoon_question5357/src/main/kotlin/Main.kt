fun main(args: Array<String>) {
    question5357()
}

fun question5357() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        val sentence = readln()
        val stringBuilder = StringBuilder()
        sentence.forEach {
            if(stringBuilder.isBlank() || stringBuilder.last() != it) {
                stringBuilder.append(it)
            }
        }
        println(stringBuilder)
    }
}