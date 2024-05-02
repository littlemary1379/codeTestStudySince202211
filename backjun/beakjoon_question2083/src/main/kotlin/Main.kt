fun main(args: Array<String>) {
    question2083()
}

fun question2083() {
    while (true) {
        val user = readln().split(" ")
        if(user[0] == "#") {
            break
        } else {
            println("${user[0]} ${if(user[1].toInt() > 17 || user[2].toInt() >= 80) {
                "Senior"
            } else {
                "Junior"
            }}")
        }
    }
}