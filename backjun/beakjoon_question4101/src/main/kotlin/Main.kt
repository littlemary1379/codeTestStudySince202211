fun main(args: Array<String>) {
    question4101()
}

// 크냐?
fun question4101() {
    while (true) {
        val case = readln().split(" ").map { it.toInt() }
        if(case[0] == 0 && case[1] == 0) {
            break
        } else {
            println(if(case[0] > case[1]) "Yes" else "No")
        }
    }
}