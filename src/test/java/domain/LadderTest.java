package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class LadderTest {

    @DisplayName("count null 입력 예외 발생")
    @Test
    void createCountNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Ladder.create(null, 5));
    }

    @DisplayName("height null 입력 예외 발생")
    @Test
    void createHeightNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Ladder.create(5, null));
    }
}