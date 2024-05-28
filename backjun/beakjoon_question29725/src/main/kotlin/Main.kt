fun main(args: Array<String>) {
    question29725()
}

fun question29725() {
    var white = 0
    var black = 0
    for(i in 1 .. 8) {
        readln().forEach {
            when(it) {
                'k' -> black += 0
                'p' -> black += 1
                'n' -> black += 3
                'b' -> black += 3
                'r' -> black += 5
                'q' -> black += 9
                'K' -> white += 0
                'P' -> white += 1
                'N' -> white += 3
                'B' -> white += 3
                'R' -> white += 5
                'Q' -> white += 9
            }
        }
    }

    println(white - black)
}