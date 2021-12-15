import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderTest {
    @Test
    public void testNumberOfPeopleZero() {
        int people = 0;
        assertThatThrownBy(() -> new Ladder(people, 10))
                .isInstanceOf(InvalidNumberOfPeopleException.class);
    }

    @Test
    public void testNumberOfPeopleRandom() {
        int people = 2;
        assertThatCode(() -> new Ladder(people, 10))
                .doesNotThrowAnyException();
    }

    @Test
    public void testHeightZero() {
        int height = 0;

        assertThatThrownBy(() -> new Ladder(10, height))
                .isInstanceOf(InvalidHeightOfLadderException.class);
    }

    @Test
    public void testHeightRandom() {
        int height = 2;

        assertThatCode(() -> new Ladder(10, height))
                .doesNotThrowAnyException();
    }
}
