import Number.ZeroToNineNumber

class Car(val name: String, val number: Number = ZeroToNineNumber()) {
    var position: Int = 0

    fun move() {
        if (number.value() > 6) {
            position += 1
        }
    }

    fun show() {
        View.ConsoleView.showRacing(name, position)
    }
}