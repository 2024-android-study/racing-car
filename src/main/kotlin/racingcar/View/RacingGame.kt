package racingcar.View

import racingcar.service.CarService

class RacingGame {

    private val inputView = InputView()
    private val outputView = OutputView()

    fun play() {
        val userInput = inputView.inputCarName()
        val trialNum = inputView.inputTrialNum()
        val carService = CarService(userInput)

        outputView.printResultMessage()

        repeat(trialNum) {
            outputView.printRaceResult(carService.race())
        }

        outputView.printWinner(carService.getWinner())
    }

}