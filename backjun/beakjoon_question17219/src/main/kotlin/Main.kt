fun main(args: Array<String>) {
    question17219()
}

fun question17219() {
    val case = readln().split(" ").map { it.toInt() }
    val passwordList = HashMap<String, String>()
    val stringBuilder = StringBuilder()
    for(i in 1 .. case[0]) {
        val password = readln().split(" ")
        passwordList[password[0]] = password[1]
    }

    for(i in 1 .. case[1]) {
        val page = readln()
        stringBuilder.append(passwordList[page])
        stringBuilder.append("\n")
    }

    println(stringBuilder)
}
