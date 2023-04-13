import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    question1003()
}

fun question1003() {

    var reader = BufferedReader(InputStreamReader(System.`in`))
    var case = reader.readLine().toInt()

    var previous0 = 0;
    var previous1 = 0;
    var result0 = 0;
    var result1 = 0;

    for(i in 1 .. case){
        var testCase = reader.readLine().toInt()
        for(i in 0 .. testCase) {
            when (i) {
                0 -> {
                    result0 = 1
                    result1 = 0
                }
                1 -> {
                    previous0 = result0
                    previous1 = result1
                    result0 = 0
                    result1 = 1
                }
                else -> {
                    var beforeResult0 = result0
                    var beforeResult1 = result1

                    result0 += previous0
                    result1 += previous1

                    previous0 = beforeResult0
                    previous1 = beforeResult1
                }
            }

            if(i == testCase) {
                println("$result0 $result1")
            }
        }
    }
}