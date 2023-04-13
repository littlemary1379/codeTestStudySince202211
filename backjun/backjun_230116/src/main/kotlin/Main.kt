import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question1002()
}

fun question1002() {

    var reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var count = reader.readLine().toString().toInt()
    var bufferCount = 0

    var arrayList = ArrayList<Int>()

    while(bufferCount < count) {
        var turret = reader.readLine().toString()
        var array = turret.split(" ")

        var xLength = (array[0].toInt() - array[3].toInt()).toDouble()
        var yLength = (array[1].toInt() - array[4].toInt()).toDouble()
        var duration = sqrt((xLength.pow(2.0)) + (yLength.pow(2.0)))

        var jLength = array[2].toDouble()
        var bLength = array[5].toDouble()

        //두 점에서 만나는 경우
        if(jLength + bLength > duration && abs(jLength - bLength) < duration) {
            arrayList.add(bufferCount, 2)
            println(2)
            // 한 점에서 만나는 경우
        } else if(duration!= 0.0 && (jLength + bLength == duration|| abs(jLength - bLength) == duration)) {
            arrayList.add(bufferCount, 1)
            println(1)
            // 같은 원일경우
        } else if(duration == 0.0 && jLength == bLength) {
            arrayList.add(bufferCount, -1)
            println(-1)
        } else {
            // 만나지 않는 경우
            arrayList.add(bufferCount, 0)
            println(0)
        }

        bufferCount ++
    }

}

fun question1001() {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    println(a - b)
}

fun question1000() {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    println(a+b)
}
