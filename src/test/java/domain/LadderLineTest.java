package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderLineTest {
    @Test
    @DisplayName("LadderLine 생성자 테스트")
    void constructor() {
        assertThat(new LadderLine(Arrays.asList(new Point(false, true), new Point(false, false))))
                .isEqualTo(new LadderLine(Arrays.asList(new Point(false, true), new Point(false, false))));
    }
}
