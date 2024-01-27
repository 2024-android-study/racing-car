package racingcar.model

import racingcar.view.InputView
import racingcar.view.OutputView

class RacingCarGame(
    private val inputView: InputView,
    private val outputView: OutputView
    ) {

    fun run() {
        val user = createUser()
        start(user)
        viewWinner(user)
    }

    private fun createUser(): User {
        val names = inputView.readCarNames()
        val cars = names.map {
            Car(it)
        }
        return User(cars)
    }

    private fun start(user: User) {
        var count = inputView.readTryCount()
        outputView.printResult()
        while (count > 0) {
            user.moveCar()
            viewResult(user)
            count--
        }
    }

    private fun viewResult(user: User) {
        for (car in user.cars) {
            outputView.printResultByCount(car)
        }
        println()
    }

    private fun viewWinner(user: User) {
        val maxDistance = user.cars.maxOf { it.getNameWithDistance().second }
        val winner = user.cars
            .filter { it.getNameWithDistance().second == maxDistance }
            .map { it.getNameWithDistance().first }
        outputView.printWinner(winner)
    }

    companion object {
        fun createRacingCarGame(
            inputView: InputView,
            outputView: OutputView
        ) = RacingCarGame(inputView, outputView)
    }
}