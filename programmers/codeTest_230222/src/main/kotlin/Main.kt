fun main(args: Array<String>) {
    solution2("foobar")
}

fun solution(s: String) : IntArray {
    var answerList = mutableListOf<Int>()

    for(i in s.indices) {
        var stringS = s.substring(0, i)
        var lastIndex = stringS.lastIndexOf(s[i])
        answerList.add(if(lastIndex == -1){
            -1
        } else {
            i - lastIndex
        })
    }

    return answerList.toIntArray()
}

fun solution2(s: String) : IntArray {
    var answerArray = IntArray(s.length)

    for(i in s.indices) {
        var stringS = s.substring(0, i)
        var lastIndex = stringS.lastIndexOf(s[i])
        answerArray[i] = if(lastIndex == -1){
            -1
        } else {
            i - lastIndex
        }
    }

    for (i in 0 until answerArray.size) {
        print("${answerArray[i]} ")
    }

    return answerArray
}