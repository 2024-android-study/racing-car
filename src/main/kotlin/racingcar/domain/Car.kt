package racingcar.domain

import racingcar.Constants.NumConstant

class Car(val name: String) {

    var position: Int = 0

    // 자동차 한 칸 전진 시킴
    fun move(randomNum: Int) {
        // 전진 가능한 경우
        if (randomNum >= NumConstant.CAN_MOVE_NUM) {
            this.position++
        }
    }

    
}