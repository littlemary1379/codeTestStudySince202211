import kotlin.math.pow

fun main(args: Array<String>) {
    question6825()
}

fun question6825() {
    val weight = readln().toDouble()
    val height = readln().toDouble()
    val bmi = weight / height.pow(2)

    println(if(bmi < 18.5) {
        "Underweight"
    } else if(bmi > 25) {
        "Overweight"
    } else {
        "Normal weight"
    })
}