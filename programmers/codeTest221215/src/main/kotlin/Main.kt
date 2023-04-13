fun main(args: Array<String>) {
    println("Hello World!")

    var a = 3
    var b = 2
    var n = 20

    var cola = n
    var answer = 0

    while(cola >= a) {
        var count = cola / a
        answer += (count * b)
        cola = (cola % a) + (count * b)
        println("loop : $cola / $answer")
    }

    println(answer)

}