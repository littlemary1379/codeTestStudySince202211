import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

fun main(args: Array<String>) {
    question10699()
}

fun question10699() {
    val date = Date()
    val format = SimpleDateFormat("yyyy-MM-dd")
    format.timeZone = TimeZone.getTimeZone("Asia/Seoul")
    println(format.format(date))
}