fun main(args: Array<String>) {
    question9084()
}

fun question9084() {
    val case = readln().toInt()

    for (i in 1..case) {
        val kindCount = readln().toInt()
        val kind = readln().split(" ").map { it.toInt() }
        val bill = readln().toInt()

        val dp = Array(bill + 1) { 0 }

        for (j in 0..<kindCount) {

            for (k in 1..bill) {
                if(k - kind[j] > 0) {
                    dp[k] = dp[k] + dp[k - kind[j]]
                } else if(k - kind[j] == 0){
                    dp[k]++
                }

                //println("dp[$k] = ${dp[k]}")

            }

        }

        println(dp[bill])

    }
}