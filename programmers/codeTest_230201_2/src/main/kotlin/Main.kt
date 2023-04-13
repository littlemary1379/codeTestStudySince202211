fun main(args: Array<String>) {
    var solution = Solution()
    //println(solution.solution(5, intArrayOf(2, 4), intArrayOf(3)))
    println(solution.solution3(5, intArrayOf(2, 4), intArrayOf(1, 2, 5)))
}

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray) : Int {
        var answer = n
        var borrow = 0

        lost.sort()
        reserve.sort()

        var arrayList = reserve.toMutableList()

        for (lostPeople in lost) {

            if (arrayList.contains(lostPeople)) {
                arrayList.remove(lostPeople)
                borrow += 1
                continue
            }

            if (arrayList.contains(lostPeople - 1)) {
                arrayList.remove(lostPeople - 1)
                borrow += 1
                continue
            }

            if (arrayList.contains(lostPeople + 1)) {
                if (!lost.contains(lostPeople + 1)) {
                    arrayList.remove(lostPeople + 1)
                    borrow += 1
                }
                continue
            }
        }

        return answer - (lost.size - borrow)

    }

    // 시간 감소용
    fun solution2(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        var borrow = 0

        lost.sort()
        reserve.sort()

        for(lostPeople in lost) {

            if(reserve.contains(lostPeople)) {
                reserve[reserve.indexOf(lostPeople)] = -1
                borrow += 1
                continue
            }

            if(reserve.contains(lostPeople - 1)) {
                reserve[reserve.indexOf(lostPeople - 1)] = -1
                borrow += 1
                continue
            }

            if(reserve.contains(lostPeople + 1)) {
                if (!lost.contains(lostPeople + 1)) {
                    reserve[reserve.indexOf(lostPeople + 1)] = -1
                    borrow += 1
                }
                continue
            }
        }

        return answer - (lost.size - borrow)
    }

    fun solution3(n: Int, lost: IntArray, reserve: IntArray) : Int {
        var answer = n

        lost.sort()
        reserve.sort()

        var reserveList = reserve.toMutableList()
        var lostList = lost.toMutableList()
        var borrowList = mutableListOf<Int>()

        reserveList.removeAll(lost.toList())
        lostList.removeAll(reserve.toList())

        for (lostPeople in lostList) {

            if (reserveList.contains(lostPeople)) {
                reserveList.remove(lostPeople)
                borrowList.add(lostPeople)
                continue
            }

            if (reserveList.contains(lostPeople - 1)) {
                reserveList.remove(lostPeople - 1)
                borrowList.add(lostPeople)
                continue
            }

            if (reserveList.contains(lostPeople + 1)) {
                reserveList.remove(lostPeople + 1)
                borrowList.add(lostPeople)
                continue
            }
        }

        lostList.removeAll(borrowList)

        return answer - lostList.size

    }
}