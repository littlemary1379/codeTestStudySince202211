fun main(args: Array<String>) {
    question30045()
}

fun question30045() {
    val case = readln().toInt()
    var count = 0
    for(i in 1 .. case) {
        readln().let {
            for(j in 0 ..< it.count() - 1) {
                if((it[j] == '0' && it[j + 1] == '1') || (it[j] == 'O' && it[j + 1] == 'I')) {
                    count++
                    break
                }
            }
        }
    }
    println(count)
}