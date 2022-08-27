import Number.ZeroToNineNumber
import org.junit.jupiter.api.Test

class ViewTest {
    @Test
    fun showRacing() {
        View.ConsoleView.showRacing("j", 5)
    }

    @Test
    fun showWinner() {
        View.ConsoleView.showWinner(listOf(Car("j", ZeroToNineNumber()), Car("k", ZeroToNineNumber())))
    }
}