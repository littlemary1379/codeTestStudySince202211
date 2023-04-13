fun main(args: Array<String>) {
    println("Hello World!")

    var a = 5
    var b = 2

    var result = 0

    if(a <= b) {
        for (i in a..b) {
            result += i
        }
    } else {
        for (i in a downTo b) {
            result += i
        }
    }

    println(result)
}