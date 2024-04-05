import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val count = br.readLine().toInt()
    val deque = mutableListOf<Balloon>()
    val st = StringTokenizer(br.readLine())
    var i = 1
    while (st.hasMoreTokens()) {
        val item = st.nextToken().toInt()
        deque.add(Balloon(i, item))
        i++
    }

    var note = 0
    var countBalloons = 0

    val result = mutableListOf<Int>()

    while (deque.isNotEmpty()) {

        // 무조건 처음임~
        if (note == 0) {
            deque.removeFirst().apply {
                result.add(this.index)
                note = this.note
            }
        } else if (note > 0) {
            countBalloons += 1
            if (countBalloons != note) {
                deque.add(deque.removeFirst())
            } else {
                deque.removeFirst().apply {
                    result.add(this.index)
                    note = this.note
                    countBalloons = 0
                }
            }
        } else {
            countBalloons -= 1
            if (countBalloons != note) {
                deque.add(0, deque.removeLast())
            } else {
                deque.removeLast().apply {
                    result.add(this.index)
                    note = this.note
                    countBalloons = 0
                }
            }
        }
    }


    println(result.joinToString(" "))
}

data class Balloon(
    val index: Int,
    val note: Int
)

//fun question2346() {
//    val count = readln().toInt()
//    // Pair<순서, 쪽지 숫자>
//    val deque = ArrayDeque<Pair<Int, Int>>()
//    val balloons = readln().split(" ").map { it.toInt() }
//
//    for (i in 1 .. count) {
//        deque.add(Pair(i, balloons[i - 1]))
//    }
//
//    val stringBuilder = StringBuilder()
//
//    val firstShot = deque.removeFirst()
//    stringBuilder.append("${firstShot.first} ")
//    var note = firstShot.second
//    var countBalloons = 0
//
//    while (deque.isNotEmpty()) {
//        if(note > 0) {
//            countBalloons += 1
//            if(countBalloons != note) {
//                deque.add(deque.removeFirst())
//            } else {
//                val shot = deque.removeFirst()
//                stringBuilder.append("${shot.first}" )
//                note = shot.second
//                countBalloons = 0
//            }
//        } else {
//            countBalloons -= 1
//            if(countBalloons != note) {
//                deque.addFirst(deque.removeLast())
//            } else {
//                val shot = deque.removeLast()
//                stringBuilder.append("${shot.first}" )
//                note = shot.second
//                countBalloons = 0
//            }
//        }
//    }
//
//    println(stringBuilder.toString().trim())
//
//}

