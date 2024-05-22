import kotlin.math.max

fun main(args: Array<String>) {
    question2579()
}

fun question2579() {
    val stairCount = readln().toInt()
    val stairs = mutableListOf<Int>()
    for (i in 1..stairCount) {
        stairs.add(readln().toInt())
    }

    stairs.add(0, 0)

    val stairAdd = Array(stairCount + 1) { 0 }

    for (i in 1..stairCount) {
        when (i) {
            1 -> {
                stairAdd[1] = stairs[1]
            }
            2 -> {
                stairAdd[2] = stairs[1] + stairs[2]
            }
            3 -> {
                stairAdd[3] = max(stairs[1], stairs[2]) + stairs[3]
            }
            else -> {
                stairAdd[i] = max(stairAdd[i - 3] + stairs[i - 1], stairAdd[i - 2]) + stairs[i]
            }
        }
    }
    println(stairAdd.toList().last())
}

// 오류코드

//val stairTab = Array(stairCount + 1) { false }
//val stairAdd = Array(stairCount + 1) { 0 }
//
//// 마지막 계단은 무조건 밟아야함~ 그러니까 마지막 계단 밟았단 가정하에 거꾸로 내려감
//stairTab[stairCount] = true
//stairAdd[stairCount] = stairs[stairCount]
//for (i in stairCount - 1 downTo 1) {
//    if (!stairTab[i + 1]) {
//        stairAdd[i] = stairAdd[i + 1] + stairs[i]
//        stairTab[i] = true
//    } else {
//        if (i + 2 > stairCount || !stairTab[i + 2]) {
//            stairAdd[i] = stairAdd[i + 1] + stairs[i]
//            stairTab[i] = true
//        } else {
//            stairAdd[i] = max(stairAdd[i + 1], stairAdd[i + 2] + stairs[i])
//            if (stairAdd[i] != stairAdd[i + 1]) {
//                stairTab[i] = true
//                stairTab[i + 1] = false
//            }
//        }
//    }
//
//}