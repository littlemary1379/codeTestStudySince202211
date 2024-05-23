fun main(args: Array<String>) {
    question25640()
}

fun question25640() {
    val myMbti = readln()
    val person = readln().toInt()
    var count = 0
    for (i in 1 ..person) {
        if(readln() == myMbti) {
            count++
        }
    }
    println(count)
}