import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

fun main(args: Array<String>) {
    question1005()
}

fun question1005() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var case = reader.readLine().toInt()

    for (i in 1..case) {
        var buildingCase = reader.readLine().toString()
        var buildingTime = reader.readLine().toString()

        var buildingCount : Int
        var buildingCaseCount : Int
        buildingCase.split(" ").let {
            buildingCount = it[0].toInt()
            buildingCaseCount = it[1].toInt()
        }

        // 1부터 넣을 편안함을 위해.. 1부터 시작하기 위해 +1 함..
        var inputArray = MutableList(buildingCount + 1) { 0 }
        var connectionArray = mutableListOf<String>()


        var buildingTimeArray = buildingTime.split(" ")
        println(buildingTimeArray)

        for(j in 1 .. buildingCaseCount) {
            var buildingConnection = reader.readLine().toString()
            println(buildingConnection)
            connectionArray.add(buildingConnection)
            buildingConnection.split(" ").let {
                inputArray[it[1].toInt()] = inputArray[it[1].toInt()] + 1
            }
        }

        println("inputArray : $inputArray")
        println("connectionArray : $connectionArray")

        var lastBuilding = reader.readLine().toInt()
        println("lastBuilding : ${lastBuilding}")

        val quene = LinkedList<String>()

        for(i in 1 until inputArray.size) {
            if(inputArray[i] == 0) {
                quene.add(i.toString())
            }
        }

        while (inputArray.get(lastBuilding) != 0) {

            val removeQuene = quene.poll()
            for (j in 0 until connectionArray.size) {
                connectionArray[j].split(" ").let {
                    if(it[0] == removeQuene) {
                        inputArray[it[1].toInt()] = inputArray[it[1].toInt()]-1
                    }
                }
            }

            for(i in 1 until inputArray.size) {
                if(inputArray[i] == 0) {
                    quene.add(i.toString())
                    println("quene : $quene")
                }
            }
        }

        println("inputArray : $inputArray")

    }
}