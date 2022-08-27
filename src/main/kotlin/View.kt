interface View {
    fun showRacing(carName: String, position: Int)

    object ConsoleView : View {
        override fun showRacing(carName: String, position: Int) {
            println("$carName : ${graph(position)}")
        }

        private fun graph(position: Int): String {
            var graph = ""
            (1..position).forEach { graph += "-" }
            return graph
        }
    }
}
