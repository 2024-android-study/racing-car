package racingcar.validation

enum class NameError(val message: String) {
    EMPTY("[ERROR] 값을 다시 입력해 주세요."),
    CONTAIN_GAP("[ERROR] 공백이 포함되어 있습니다.")
}