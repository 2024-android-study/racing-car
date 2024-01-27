package racingcar

import racingcar.model.RacingCarGame
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    RacingCarGame
        .createRacingCarGame(inputView, outputView)
        .run()
}
