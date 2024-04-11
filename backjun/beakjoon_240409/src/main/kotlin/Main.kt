import kotlin.math.min

fun main(args: Array<String>) {
    question1463()
}

fun question1463() {
    val number = readln().toInt()

    val caseArray = Array(1000001) { 0 }
    caseArray[2] = 1
    caseArray[3] = 1

    for(i in 4 ..< caseArray.size) {
        if(i % 6 == 0) {
            caseArray[i] = arrayOf(caseArray[i / 2], caseArray[i / 3], caseArray[i - 1]).min() + 1
        } else if(i % 3 == 0) {
            caseArray[i] = min(caseArray[i / 3], caseArray[i - 1]) + 1
        } else if(i % 2 == 0) {
            caseArray[i] = min(caseArray[i / 2], caseArray[i - 1]) + 1
        } else {
            caseArray[i] = caseArray[i - 1] + 1
        }
    }

    println(caseArray[number])

}