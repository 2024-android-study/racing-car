package racingcar

import camp.nextstep.edu.missionutils.Randoms
import view.InputView
import view.OutputView

class RacingGame {
    companion object {
        private const val MAX_NUM = 9
        private const val MIN_NUM = 0
    }
    private val input = InputView()
    private val output = OutputView()
    fun run() {
        output.printStart()
        val cars : List<Car> = input.getCarNames().map {
            Car(it)
        }

        output.printTime()
        val tryTime = input.getTime()

        output.printResultTitle()

        for(i in 0 until tryTime.toInt()) game(cars)

        output.printWinners(getWinner(cars))
    }

    private fun game(cars: List<Car>) {
        for(car in cars) {
            car.goForwardOrStop(getRandomNum())
        }
        output.printResult(cars)
    }

    private fun getRandomNum(): Int {
        return Randoms.pickNumberInRange(MIN_NUM, MAX_NUM)
    }

    private fun getWinner(cars: List<Car>): List<String> {
        val winnersDistance = cars.maxOf { it.distance.length }
        return cars.filter { it.distance.length == winnersDistance }.map { it.name }
    }
}