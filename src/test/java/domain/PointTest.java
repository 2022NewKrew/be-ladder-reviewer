package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    @DisplayName("Point 생성자 테스트")
    void constructor() {
        assertThat(new Point(false, false)).isEqualTo(new Point(false, false));
    }

    @Test
    @DisplayName("첫번째 Point 생성")
    void firstPoint() {
        assertThat(Point.firstPoint(true)).isEqualTo(Point.firstPoint(true));
    }

    @Test
    @DisplayName("마지막 Point 생성")
    void lastPoint() {
        assertThat(Point.lastPoint(true)).isEqualTo(Point.lastPoint(true));
    }
}
