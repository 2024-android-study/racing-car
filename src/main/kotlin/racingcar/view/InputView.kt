package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.validation.InputValidator

class InputView {
    fun readCarNames(): List<String> {
        println(READ_CAR_NAME_MESSAGE)
        val names = Console.readLine()
        InputValidator.checkName(names)
        return names.split(",")
    }

    fun readTryCount(): Int {
        println(READ_TRY_COUNT_MESSAGE)
        val count = Console.readLine()
        InputValidator.checkTryCycle(count)
        println()
        return count.toInt()
    }

    companion object {
        private const val READ_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
        private const val READ_TRY_COUNT_MESSAGE = "시도할 횟수는 몇 회인가요?"
    }
}