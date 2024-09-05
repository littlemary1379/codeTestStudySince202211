import java.lang.Math.pow
import java.lang.Math.sqrt

fun main() {
    question17357()
    //makeEx()
}

fun question17357() {
    val size = readln().toInt()
    val list = readln().split(" ").map { it.toDouble() }

    for(i in 1 .. size) {
        val varList = mutableListOf<Double>()
        for(j in 0 .. size - i) {
            val splitList = list.subList(j, j + i)
            varList.add(getV(splitList, getM(splitList)))
        }
        println("k = $i, $varList")
        println(varList.indexOf(varList.max()) + 1)
    }


}

fun getM(list : List<Double>) : Double {
    return (list.sum() / list.size)
}

fun getV(list : List<Double>, m : Double) : Double {
    var addList = 0.0
    list.forEach {
        addList += pow((it - m), 2.0)
    }
    return sqrt((addList / list.size.toDouble()))
}

fun makeEx() {
    var text = ""
    for(i in 1 .. 999) {
        text += "1000000 "
    }
    println(1000)
    println(text + "1")
}