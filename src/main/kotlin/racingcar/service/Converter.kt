package racingcar.service

class Converter {
    fun splitByComma(str: String): List<String> {
        return str.split(",")
    }

    fun mapCarNameToMoveNum(cars: List<String>): Map<String, Int> {
        return cars.associateWith { 0 } // cars.map { it to 0 }.toMap()
    }

    fun intToMovementString(move: Int): String {
        var result = ""
        for (i: Int in 0 until move) {
            result += "-"
        }
        return result
    }

    fun mapToWinnerList(map: Map<String, Int>): List<String> {
        val sortedMap = map.toList().sortedByDescending {it.second}.toMap().toMutableMap() // 내림차순 정렬

        val winnerList = mutableListOf<String>()

        var maxValue = 0
        for ((key, value) in sortedMap) {
            if (value >= maxValue) {
                maxValue = value
                winnerList.add(key)
            }
        }
        return winnerList
    }
}