package ladder.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.*;

public class LadderTest {

    @Test
    void heightTest() {
        Ladder ladder1 = new Ladder(3);
        Ladder ladder2 = new Ladder(4);
        Ladder ladder3 = new Ladder(5);
        assertThat(ladder1.getHeight()).isEqualTo(3);
        assertThat(ladder2.getHeight()).isEqualTo(4);
        assertThat(ladder3.getHeight()).isEqualTo(5);
    }

}
