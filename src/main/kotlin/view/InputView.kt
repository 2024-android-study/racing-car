package view

import camp.nextstep.edu.missionutils.Console

class InputView {
    companion object {
        const val MAX_LENGTH = 5
        const val ERROR_NAME_LENGTH = "자동차의 이름은 5자 이하로 입력해주세요"
        const val ERROR_NAME_EMPTY = "자동차의 이름이 빈칸입니다"
        const val ERROR_TIME_EMPTY = "시도 횟수가 빈칸입니다"
        const val ERROR_TIME_ZERO = "0이 아닌 자연수를 입력해 주세요"
        const val ERROR_TIME_NOT_NUMBER = "시도 횟수는 숫자만 입력해 주세요"
    }
    fun getCarNames(): List<String> {
        val names = Console.readLine()
        checkCarNameValidate(names)
        return names.split(",")
    }

    private fun checkCarNameValidate(names: String) {
        for(name in names.split(",")) {
            require(name.isNotEmpty()) { ERROR_NAME_EMPTY }
            require(name.length <= MAX_LENGTH) { ERROR_NAME_LENGTH }
        }
    }
    fun getTime(): String {
        val time = Console.readLine()
        checkTimeValidate(time)
        return time
    }

    private fun checkTimeValidate(time: String) {
        require(time.isNotEmpty()) { ERROR_TIME_EMPTY }
        require(!time.startsWith("0")) { ERROR_TIME_ZERO }
        require(time.all{ it.isDigit() }) { ERROR_TIME_NOT_NUMBER }
    }
}