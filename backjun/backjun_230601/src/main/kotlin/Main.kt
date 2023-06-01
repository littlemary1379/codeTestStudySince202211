fun main(args: Array<String>) {
    question5622()
}

fun question5622() {
    var word = readLine()!!.toCharArray()
    var time = 0

    word.forEach {
        var code = it.code - 65
        time += if(code < 18) {
            (code) / 3 + 2 + 1
        } else if(code < 25) {
            (code - 1) / 3 + 2 + 1
        } else {
            (code - 2) / 3 + 2 + 1
        }
    }

    println(time)

}