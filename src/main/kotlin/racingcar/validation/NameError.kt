package racingcar.validation

enum class NameError(val message: String) {
    OUT_OF_RANGE("[ERROR] 5자 이내의 이름으로 입력해야 합니다.")
}