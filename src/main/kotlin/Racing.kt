class Racing(val carNames: String, val tryNumber: Int) {
    fun run() {
        val cars = Cars.Smart().toCars(carNames)
        (0..tryNumber).forEach {
            cars.move()
            cars.show()
        }
    }
}
