fun main(args: Array<String>) {
    question24313()
}

fun question24313() {

    var functionNumber = readln().split(" ").map { it.toInt() }
    var cNumber = readln().toInt()
    var compareNumber = readln().toInt()

    println(functionNumber[0] * compareNumber + functionNumber[1])
    println(compareNumber * cNumber)

    if(functionNumber[0] * compareNumber + functionNumber[1] <= compareNumber * cNumber
        && functionNumber[0] <= cNumber) {
        println("1")
    } else {
        println("0")
    }

}