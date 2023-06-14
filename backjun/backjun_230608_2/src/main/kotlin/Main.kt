fun main(args: Array<String>) {
    question4344()
}

fun question4344() {
    var readLine = readLine()!!.toInt()

    for(i in 1 .. readLine) {
        var case = readLine()!!.split(" ").map { it.toInt() }
        var students = case[0]
        var grades = case.subList(1, case.size)

        var average = grades.sum() / students

        var percentage = grades.count { it > average }.toFloat() / students * 100
        println("${String.format("%.3f", percentage)}%")
    }
}