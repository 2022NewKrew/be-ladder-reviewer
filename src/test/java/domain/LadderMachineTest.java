package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class LadderMachineTest {

    @DisplayName("count null 입력 예외 발생")
    @Test
    void createCountNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> LadderMachine.create(null, 5));
    }

    @DisplayName("height null 입력 예외 발생")
    @Test
    void createHeightNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> LadderMachine.create(5, null));
    }
}