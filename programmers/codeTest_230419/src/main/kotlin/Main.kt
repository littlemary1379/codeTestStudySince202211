import kotlin.math.ceil
import kotlin.math.round

fun main(args: Array<String>) {
    var solution = Solution()
    //println(solution.solution(intArrayOf(180, 5000, 10, 600), arrayOf("05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT")))
    println(solution.solution(intArrayOf(1, 461, 1, 10), arrayOf("00:00 1234 IN")))
}

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var car = HashMap<String, Cars>()

        records.forEach {
            var record = it.split(" ")
            if(record[2] == "IN") {
                println("${record[0]} ${record[1]} 입차")
                if(car.containsKey(record[1])) {
                    var cars = car[record[1]]
                    cars?.inTime = record[0]
                } else {
                    var cars = Cars()
                    cars?.inTime = record[0]
                    car[record[1]] = cars
                }
            } else {
                println("${record[0]} ${record[1]} 출차")
                var cars = car[record[1]]
                var inHourTime = cars?.inTime!!.split(":").map { time -> time.toInt() }
                var outHourTime = record[0].split(":").map { time -> time.toInt() }

                var hour = outHourTime[0] - inHourTime[0]
                var minute = outHourTime[1] - inHourTime[1]

                cars.accuTime += hour * 60 + minute
                cars.inTime = ""

            }
        }

        var answer = mutableListOf<Int>()

        car.toSortedMap().forEach {

            if(it.value.inTime != "") {
                var inHourTime = it.value.inTime!!.split(":").map { time -> time.toInt() }

                var hour = 23 - inHourTime[0]
                var minute = 59 - inHourTime[1]

                it.value.accuTime += hour * 60 + minute
                it.value.inTime = ""

            }

            var totalFee = if(it.value.accuTime <= fees[0]) {
                fees[1]
            } else {
                fees[1] + ceil((it.value.accuTime - fees[0]) / fees[2].toDouble()) * fees[3]
            }
            answer.add(totalFee.toInt())

        }

        println(answer)

        return answer.toIntArray()
    }
}

// 입차일때는 inTime 값 변경
// 출차일때는 inTime 초기화, accuTime 값 추가
class Cars {
    var inTime = ""
    var accuTime = 0
}