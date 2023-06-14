fun main(args: Array<String>) {
    question2563()
}

fun question2563() {
    var paperCount = readLine()!!.toInt()
    var paper : Array<Array<Int>> = Array(100) { Array(100) { 1 } }
    var count = 0

    for(i in 1 .. paperCount) {
        var item = readLine()!!.split(" ").map { it.toInt() }
        for ( j in item[0] until item[0] + 10) {
            for( k in item[1] until item[1] + 10) {
 //               if(paper[j][k] == 1) {
                    paper[j][k] = 0
//                    count += 1
//                }

            }
        }
    }

    paper.forEach {
        count += it.count { item -> item == 0 }
    }

    println(count)
}