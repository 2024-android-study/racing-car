package racingcar.validation

import racingcar.extension.isNotOutOfRange

object InputValidator {

    fun checkName(input: String) {
        require(input.isNotEmpty()) { CommonError.EMPTY.message }
        require(input.contains(" ").not()) { CommonError.CONTAIN_GAP.message }
        require(input.isNotOutOfRange()){ NameError.OUT_OF_RANGE.message }
    }

    fun checkTryCycle(input: String) {
        require(input.isNotEmpty()) { CommonError.EMPTY.message  }
        require(input.contains(" ").not()) { CommonError.CONTAIN_GAP.message }
        require(input != "0") { CycleError.MIN_NUMBER.message }
        require(input.matches(Regex("\\d+"))) { CycleError.CONTAIN_CHAR.message }
    }
}