fun main(args: Array<String>) {
    question29807()
}

fun question29807() {
    val count = readln().toInt()
    // 국어 수학 영어 탐구 제2외국어
    readln().split(" ").map { it.toInt() }.toMutableList().let {

        if(count < 5) {
            for(i in count + 1 .. 5) {
                it.add(i - 1, 0)
            }
        }

        var number = 0

        number += if(it[0] > it[2]) {
            (it[0] - it[2]) * 508
        } else {
            (it[2] - it[0]) * 108
        }

        number += if(it[1] > it[3]) {
            (it[1] - it[3]) * 212
        } else {
            (it[3] - it[1]) * 305
        }

        number += it[4] * 707
        println(number * 4763)

    }
}