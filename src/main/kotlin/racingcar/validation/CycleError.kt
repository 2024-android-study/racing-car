package racingcar.validation

enum class CycleError(val message: String) {
    MIN_NUMBER("[ERROR] 시도 횟수는 0 이상의 숫자를 입력해야 합니다."),
    CONTAIN_CHAR("[ERROR] 문자가 포함되어 있습니다. 숫자만 입력해 주세요.")
}