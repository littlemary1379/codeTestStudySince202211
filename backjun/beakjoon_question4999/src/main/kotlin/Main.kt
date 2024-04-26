fun main(args: Array<String>) {
    question4999()
}

fun question4999() {
    val jaehanAh = readln().length
    val doctorAh = readln().length

    println(if(jaehanAh >= doctorAh) "go" else "no")

}