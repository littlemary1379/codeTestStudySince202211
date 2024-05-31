fun main(args: Array<String>) {
    question2775()
}

fun question2775() {

    val apart = Array(15) { Array(15) { 0 } }

    // 0층은 부녀회장 기준을 만족할 필요가 없으며, 0층의 i호에는 i명이 살고 있으므로 초기화
    for(i in 1 .. 14) {
        apart[0][i] = i
    }

    for(i in 1 .. 14) {
        for(j in 1 .. 14) {
            var all = 0
            for(k in 1 .. j) {
                all += apart[i - 1][k]
            }
            apart[i][j] = all
        }
    }

    val case = readln().toInt()
    for (i in 1 .. case) {
        println(apart[readln().toInt()][readln().toInt()])
    }

}