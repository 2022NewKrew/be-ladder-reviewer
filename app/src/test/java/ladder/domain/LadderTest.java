package ladder.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.*;

public class LadderTest {

    @Test
    void heightTest() {
        Ladder ladder1 = new Ladder(3, 5);
        Ladder ladder2 = new Ladder(4, 2);
        Ladder ladder3 = new Ladder(5, 3);
        assertThat(ladder1.getHeight()).isEqualTo(3);
        assertThat(ladder2.getHeight()).isEqualTo(4);
        assertThat(ladder3.getHeight()).isEqualTo(5);
    }

    @Test
    void validHeightTest() {
        assertThatThrownBy(() -> new Ladder(0, 5))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ladder(-1, 5))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void widthTest() {
        Ladder ladder1 = new Ladder(3, 5);
        Ladder ladder2 = new Ladder(4, 7);
        Ladder ladder3 = new Ladder(5, 4);
        assertThat(ladder1.getWidth()).isEqualTo(5);
        assertThat(ladder2.getWidth()).isEqualTo(7);
        assertThat(ladder3.getWidth()).isEqualTo(4);
    }

    @Test
    void validWidthTest() {
        assertThatThrownBy(() -> new Ladder(5, -1))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ladder(5, 0))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void uiViewTest() {
        Ladder ladder1 = new Ladder(7, 5);
        System.out.println(ladder1);
    }

}
