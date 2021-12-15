package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderLinesTest {
    @Test
    @DisplayName("LadderLines 생성자 테스트")
    void constructor() {
        assertThat(new LadderLines(Arrays.asList(new LadderLine(Arrays.asList(new Point(false, true), new Point(false, false))))))
                .isEqualTo(new LadderLines(Arrays.asList(new LadderLine(Arrays.asList(new Point(false, true), new Point(false, false))))));
    }
}
