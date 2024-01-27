package racingcar.extension

fun String.isNotOutOfRange(): Boolean {
    var isValid = true
    for (name in this.split(",")) {
        if (name.length > 5) isValid = false
    }
    return isValid
}