import java.lang.StringBuilder

fun main(args: Array<String>) {
    question5358()
}

fun question5358() {
    while (true) {
        val name = readlnOrNull()
        if(name.isNullOrEmpty()) {
            break
        }
        val sb = StringBuilder()
        name.forEach {
            when(it) {
                'i' -> sb.append('e')
                'e' -> sb.append('i')
                'E' -> sb.append('I')
                'I' -> sb.append('E')
                else -> sb.append(it)
            }
        }

        println(sb)
    }
}