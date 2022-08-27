class Racing(val carNames: String, val tryNumber: Int) {
    fun run() {
        val cars = Cars.StringCars(carNames)
        (0..tryNumber).forEach { cars.move() }
    }
}
