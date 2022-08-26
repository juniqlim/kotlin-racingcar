import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun test() {
        assertThat(Car("j").name).isEqualTo("j")
    }
}
