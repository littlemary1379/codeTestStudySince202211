fun main(args: Array<String>) {
    question15873()
}

fun question15873() {
    val case = readln()
    if(!case.contains('0')) {
        println(case[0].toString().toInt() + case[1].toString().toInt())
    } else {
        val a : Int
        val b : Int
        if(case.indexOf('0') == 1) {
            a = case.subSequence(0, 2).toString().toInt()
            b = case.subSequence(2..<case.length).toString().toInt()
        } else {
            a = case.subSequence(0, 1).toString().toInt()
            b = case.subSequence(1..<case.length).toString().toInt()
        }
        println(a + b)
    }
}