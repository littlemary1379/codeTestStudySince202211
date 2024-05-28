fun main(args: Array<String>) {
    question31668()
}

fun question31668() {
    val oneLine = readln().toInt()
    val gram = readln().toInt()
    val eggPlant = readln().toInt()
    println((gram / oneLine) * eggPlant)
}