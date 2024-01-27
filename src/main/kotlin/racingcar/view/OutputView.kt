package racingcar.view

import racingcar.model.Car

class OutputView {

    fun printResult() = println(RESULT_VIEW)

    fun printResultByCount(car: Car) {
        val nameWithDistance = car.getNameWithDistance()
        println(RESULT_VIEW_NAME_DISTANCE.format(nameWithDistance.first, nameWithDistance.second))
    }

    fun printWinner(winner: List<String>) {
        println(RESULT_WINNER.format(winner.joinToString(", ")))
    }

    companion object {
        private const val RESULT_VIEW = "실행 결과"
        private const val RESULT_VIEW_NAME_DISTANCE = "%s : %s"
        private const val RESULT_WINNER = "최종 우승자 : %s"
    }
}