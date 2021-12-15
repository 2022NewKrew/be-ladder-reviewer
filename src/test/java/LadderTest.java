import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;
import ladder.Ladder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderTest {
    @Test
    public void testNumberOfPeopleZero() {
        final int height = 10;
        final int people = 0;
        assertThatThrownBy(() -> new Ladder(people, height))
                .isInstanceOf(InvalidNumberOfPeopleException.class);
    }

    @Test
    public void testNumberOfPeopleRandom() {
        final int height = 10;
        assertThatThrownBy(() -> new Ladder(1, height))
                .isInstanceOf(InvalidNumberOfPeopleException.class);
        assertThatCode(() -> new Ladder(2, height))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(3, height))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(4, height))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(5, height))
                .doesNotThrowAnyException();
    }

    @Test
    public void testHeightZero() {
        final int people = 3;
        final int height = 0;
        assertThatThrownBy(() -> new Ladder(people, height))
                .isInstanceOf(InvalidHeightOfLadderException.class);
    }

    @Test
    public void testHeightRandom() {
        final int people = 3;

        assertThatCode(() -> new Ladder(people, 1))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(people, 2))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(people, 3))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(people, 4))
                .doesNotThrowAnyException();
        assertThatCode(() -> new Ladder(people, 5))
                .doesNotThrowAnyException();

    }

    @Test
    public void testPrint() {
        var ladder = new Ladder(3, 1);
        assertThatCode(ladder::print)
                .doesNotThrowAnyException();
    }
}
