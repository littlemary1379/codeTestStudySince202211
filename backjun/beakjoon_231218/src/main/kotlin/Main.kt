fun main(args: Array<String>) {
    question5086()
}

fun question5086() {

    while (true) {
        val line = readln().split(" ").map { it.toInt() }
        if(line[0] == 0 && line[1] == 0) {
            break
        }

        // when으로 표현했으면 더 좋았겠다.
        if(line[0] > line[1] && (line[0] % line[1] == 0)) {
            println("multiple")
        } else if(line[0] < line[1] && (line[1] % line[0] == 0)) {
            println("factor")
        } else {
            println("neither")
        }

    }
}