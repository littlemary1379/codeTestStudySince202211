import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10989()
}

fun question10989() {

    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    val count = reader.readLine().toInt()
    val list = Array<Int>(10001) {0}

    for(i in 0 ..< count) {
        val number = reader.readLine().toInt()
        list[number] += 1
    }


    for(i in 0 ..< list.count()) {
        if(list[i] > 0) {
            repeat(list[i]) {
                writer.write("$i")
                writer.newLine()
            }
        }
    }

    writer.flush()

}

//fun question10989() {
//    val count = readln().toInt()
//    val list = mutableListOf<Int>()
//    countFor@ for (i in 0..<count)  {
//        val number = readln().toInt()
//        if(i == 0) {
//            list.add(number)
//        } else {
//            for(j in 0..< list.count()) {
//                if(list[j] > number) {
//                    list.add(j, number)
//                    continue@countFor
//                }
//            }
//            list.add(number)
//        }
//    }
//
//    println(list)
//}