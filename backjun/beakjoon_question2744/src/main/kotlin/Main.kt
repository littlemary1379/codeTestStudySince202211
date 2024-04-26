fun main(args: Array<String>) {
    question2744()
}

fun question2744() {
    val word = readln()
    val stringBuilder = StringBuilder()
    word.forEach {
        if(it.isLowerCase()) {
            stringBuilder.append(it.uppercaseChar())
        } else {
            stringBuilder.append(it.lowercaseChar())
        }
    }

    println(stringBuilder)
}