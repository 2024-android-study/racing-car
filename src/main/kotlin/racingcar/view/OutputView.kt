package racingcar.view

import racingcar.config.GameMessageConstant
import racingcar.service.Converter

class OutputView {

    val converter = Converter()

    fun showGameTryMessage() {
        println(GameMessageConstant.TRY_GAME)
    }

    fun showMovement(info: Map<String, Int>) {
        for ((key, value) in info) {
            println(GameMessageConstant.OUTPUT_CAR_MOVEMENT.format(key, converter.intToMovementString(value)))
        }
    }

    fun printGameResult() {

    }
}