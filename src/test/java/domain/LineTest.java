package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class LineTest {

    @DisplayName("point generator가 null이면 예외 발생")
    @Test
    void createNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Line.create(2, null));
    }

    @DisplayName("count가 2보다 작으면 예외 발생")
    @Test
    void createInvalidCount() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Line.create(1, new RandomPointGenerator()));
    }
}