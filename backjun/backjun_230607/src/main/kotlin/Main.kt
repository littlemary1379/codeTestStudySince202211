fun main(args: Array<String>) {
    question2444()
}

fun question2444() {
    var count = readLine()!!.toInt()

    for(i in 1 until count * 2) {
       if(i <= count) {
           println("${" ".repeat(count - i)}${"*".repeat(i * 2 - 1)}")
       } else {
           println("${" ".repeat(i - count)}${"*".repeat((count * 2 - i) * 2 - 1)}")
       }
    }
}