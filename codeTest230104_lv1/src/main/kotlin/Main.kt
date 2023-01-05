import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(anotherSolution("try hello world"))
}

fun solution(s : String) : String {
    var realIndex = 0
    var stringBuilder = StringBuilder()

    for(element in s) {
        if(element != ' ') {
            if(realIndex % 2 == 0) {
                stringBuilder.append(element.uppercase())
            } else {
                stringBuilder.append(element.lowercase())
            }
            realIndex += 1
        } else {
            stringBuilder.append(element)
            realIndex = 0
        }
    }

    return stringBuilder.toString()
}

fun anotherSolution(s: String) =
    s.split(" ").joinToString(" ") { word ->
        println(word)
        word
            .mapIndexed { index, char ->
                println(index)
                if (index % 2 == 0) char.toUpperCase() else char.toLowerCase()
            }
            .joinToString("")
    }