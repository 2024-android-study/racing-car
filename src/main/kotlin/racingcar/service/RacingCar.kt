package racingcar.service

import racingcar.validator.InputValidator
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingCar {

    val inputView = InputView()
    val outputView = OutputView()

    val validator = InputValidator()
    val converter = Converter()
    val carMovement = CarMovement()

    private lateinit var movementInfo: MutableMap<String, Int>

    fun run() {
        val cars = inputView.readRaceCars()
        isValidCarLength(cars)

        val tryNum = inputView.readRaceTryNum()

        movementInfo = converter.mapCarNameToMoveNum(cars) as MutableMap<String, Int>

        tryGame(tryNum)
    }

    private fun tryGame(tryNum: Int) {
        // 출력
        outputView.showGameTryMessage()

        for (i: Int in 0 until tryNum) {
            repeatOneTry()
        }
    }

    private fun repeatOneTry() {
        movementInfo = carMovement.addCarsMovement(movementInfo)
        outputView.showMovement(movementInfo)
        println()
    }

    private fun isValidCarLength(cars: List<String>) {
        for (car in cars) {
            validator.checkCarNameLength(car)
        }
    }
}