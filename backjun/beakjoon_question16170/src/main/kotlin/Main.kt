import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    question16170()
}

fun question16170() {
    val date = Date()
    var dataFormat = SimpleDateFormat("YYYY\nMM\ndd")
    dataFormat.timeZone = TimeZone.getTimeZone("Asia/Seoul")

    println(dataFormat.format(date))
}