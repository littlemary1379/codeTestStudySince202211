fun main(args: Array<String>) {
   question30999()
}

fun question30999() {
    val people = readln().split(" ").map { it.toInt() }
    var count = 0
    for(i in 1 .. people[0]) {
        readln().let {
            if(it.count { char -> char == 'O' } > it.count { char -> char == 'X'}) {
                count++
            }
        }
    }
    println(count)
}