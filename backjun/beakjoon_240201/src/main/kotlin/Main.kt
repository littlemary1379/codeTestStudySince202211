fun main(args: Array<String>) {
    question19532()
}

fun question19532() {

    var line = readln().split(" ").map { it.toInt() }

    for (i in -999 .. 999) {
        for(j in -999 .. 999) {
            if(line[0] * i + line[1] * j == line[2]) {
                if(line[3] * i + line[4] * j == line[5]) {
                    println("$i $j")
                }
            }
        }
    }

}