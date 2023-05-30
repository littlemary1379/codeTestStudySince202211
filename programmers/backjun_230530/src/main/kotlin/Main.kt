import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10809()
}

fun question10809() {
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var word = readLine()
    var list = mutableListOf<Int>()

    // 아스키코드
    for(i in 97 .. 122) {
        word?.indexOf(i.toChar())?.let { list.add(it) }
    }

    writer.write(list.joinToString(" "))
    writer.flush()

}