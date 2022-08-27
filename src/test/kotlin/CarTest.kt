import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun create() {
        val car = Car("j", Number.ZeroToNineNumber())
        assertThat(car.name).isEqualTo("j")
        assertThat(car.position).isEqualTo(0)
    }

    @Test
    fun move() {
        val car = Car("j", Number.ZeroNumber())
        car.move()
        assertThat(car.position).isEqualTo(0)
    }
}
