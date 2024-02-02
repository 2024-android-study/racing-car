package racingcar.view

import racingcar.constants.ViewConstant
import racingcar.domain.Car

class OutputView {
    fun printResultMessage() {
        println(ViewConstant.RUN_RESULT_MESSAGE)
    }

    // 경주 결과 출력
    fun printRaceResult(cars: List<Car>) {
        cars.forEach {
            println(ViewConstant.RESULT_DISTANCE.format(it.name, ViewConstant.POSITION.repeat(it.position)))
        }

        println()
    }

    // 최종 우승자 출력
    fun printWinner(names: List<String>) {
        println(ViewConstant.RESULT_WINNER.format(names.joinToString(", ")))
    }
}