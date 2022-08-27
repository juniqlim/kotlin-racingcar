import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test

class RacingTest {
    @Test
    fun test() {
        assertThatCode { Racing("j,k,l", 5).run() }
    }
}