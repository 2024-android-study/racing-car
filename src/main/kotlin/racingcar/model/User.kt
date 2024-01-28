package racingcar.model

import racingcar.util.NumberGenerator

class User(val cars: List<Car>) {

    private fun pickNumber(): Int = NumberGenerator.generateRandomNumber()

    fun moveCar() {
        for (car in cars) {
            val number = pickNumber()
            if (number >= 4) {
                val move = car.move()
                car.addDistance(move)
                continue
            }
            car.stop()
        }
    }
}