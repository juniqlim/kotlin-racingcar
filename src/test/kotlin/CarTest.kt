import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun test() {
        val car = Car("j")
        assertThat(car.name).isEqualTo("j")
        assertThat(car.position).isEqualTo(0)
    }
}
