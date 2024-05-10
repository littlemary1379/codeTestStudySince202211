fun main(args: Array<String>) {
    question6888()
}

fun question6888() {

    val now = readln().toInt()
    val future = readln().toInt()

    var period = 0
    while(now + period <= future) {
       if(period % 2 == 0 && period % 3 == 0 && period % 4 == 0 && period % 5 == 0) {
           println("All positions change in year ${now + period}")
        }

        period++
    }
}