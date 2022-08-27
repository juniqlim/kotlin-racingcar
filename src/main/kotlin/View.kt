interface View {
    fun showRacing(carName: String, position: Int)
    fun showWinner(listOf: List<Car>)

    object ConsoleView : View {
        override fun showRacing(carName: String, position: Int) {
            println("$carName : ${graph(position)}")
        }

        private fun graph(position: Int): String {
            var graph = ""
            (1..position).forEach { graph += "-" }
            return graph
        }

        override fun showWinner(cars: List<Car>) {
            println("${carNames(cars)} 가 최종 우승했습니다.")
        }

        private fun carNames(cars: List<Car>): String {
            var carNames = ""
            for (i in cars.indices) {
                carNames += addComma(i)
                carNames += cars.get(i).name
            }
            return carNames
        }

        private fun addComma(i: Int): String {
            if (i != 0) {
                return ", "
            }
            return ""
        }
    }
}
