package racingcar.validation

import racingcar.extension.isNotOutOfRange

object InputValidator {
    fun checkName(input: String) {
        require(input.isNotEmpty()) { NameError.EMPTY.message }
        require(input.contains(" ").not()) { NameError.CONTAIN_GAP.message }
        require(input.isNotOutOfRange()){  }
    }

    fun checkTryCycle(input: String) {
        require(input.isNotEmpty()) {  }
        require(input.contains(" ").not()) {  }
        require(input != "0")
        // 문자가 포함되어 있는지
        // 0을 입력했는지
    }
}