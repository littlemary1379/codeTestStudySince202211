fun main(args: Array<String>) {
    question2231()
}

fun question2231() {

    var count = readln().toInt()

    for(i in 1 .. count) {
        var number = i
        var sum = 0
        while(number > 0) {
            sum += number % 10
            number /= 10
        }

        if(i + sum == count) {
            println(i)
            return
        }

    }

    println("0")
}