fun main(args: Array<String>) {
    question1259()
}

fun question1259() {
    while (true) {
        val case = readln()
        if(case == "0") {
            break
        } else {
            println(if(case == case.reversed()) {
                "yes"
            } else {
                "no"
            })
        }
    }
}