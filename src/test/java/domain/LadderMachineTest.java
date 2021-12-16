package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
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

    @DisplayName("Ladder를 생성할 때 규칙을 주입받을 수 있다")
    @Test
    void draw() {
        LadderMachine ladderMachine = LadderMachine.create(5, 5);
        Ladder ladder = ladderMachine.draw(new FixedPointGenerator());

        ladder.getLines().stream()
                .map(Line::getPoints)
                .flatMap(Collection::stream)
                .forEach(point -> {
                    assertThat(point.isMovable()).isFalse();
                });
    }

    static class FixedPointGenerator implements PointGenerator {
        @Override
        public Point next() {
            return Point.first();
        }
    }
}