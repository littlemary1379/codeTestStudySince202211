fun main(args: Array<String>) {
    question25206()
}

fun question25206() {
    var gradeCount = 0.0
    var gradeAll = 0.0

    var gradeArray = arrayOf("F", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+")
    for(i in 1 .. 20) {
        var grades = readLine()!!.split(" ")
        if(grades[2] == "P") {
            continue
        } else {
            gradeCount += grades[1].toDouble()
            val grade = if(grades[2] == "F") {
                0.0
            } else {
                (gradeArray.indexOf(grades[2]) + 1) * .5
            }
            gradeAll += (grade * grades[1].toDouble())
        }

    }

    println("${String.format("%.6f", gradeAll/gradeCount)}")
}