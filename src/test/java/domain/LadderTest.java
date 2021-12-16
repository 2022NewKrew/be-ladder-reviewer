package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LadderTest {

    @DisplayName("null 입력 예외 발생")
    @Test
    void createNull() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Ladder.create(null));
    }

    @DisplayName("lines를 수정하면 예외 발생")
    @Test
    void getLines() {
        Ladder ladder = Ladder.create(makeRandom(2));

        assertThatThrownBy(() -> ladder.getLines().remove(0))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    private List<Line> makeRandom(int count) {
        return Stream.generate(() -> Line.create(count, new RandomPointGenerator()))
                .limit(count)
                .collect(Collectors.toList());
    }
}