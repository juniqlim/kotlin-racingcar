class Car(val name: String, val number: Number) {
    var position: Int = 0

    fun move() {
        if (number.value() > 6) {
            position += 1
        }
    }
}