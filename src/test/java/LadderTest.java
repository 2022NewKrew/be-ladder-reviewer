import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderTest {
    @Test
    public void testNumberOfPeopleNull() {
        var input = new Ladder();
        Integer people = null;

        assertThatThrownBy(() -> input.validateNumberOfPeople(people))
                .isInstanceOf(InvalidNumberOfPeopleException.class);
    }

    @Test
    public void testNumberOfPeopleZero() {
        var input = new Ladder();
        Integer people = 0;

        assertThatThrownBy(() -> input.validateNumberOfPeople(people))
                .isInstanceOf(InvalidNumberOfPeopleException.class);
    }

    @Test
    public void testNumberOfPeopleRandom() {
        var input = new Ladder();
        Integer people = 2;
        assertThatCode(() -> input.validateNumberOfPeople(people))
                .doesNotThrowAnyException();
    }

    @Test
    public void testHeightNull() {
        var input = new Ladder();
        Integer height = null;

        assertThatThrownBy(() -> input.validateHeight(height))
                .isInstanceOf(InvalidHeightOfLadderException.class);
    }

    @Test
    public void testHeightZero() {
        var input = new Ladder();
        Integer height = 0;

        assertThatThrownBy(() -> input.validateHeight(height))
                .isInstanceOf(InvalidHeightOfLadderException.class);
    }

    @Test
    public void testHeightRandom() {
        var input = new Ladder();
        Integer height = 2;

        assertThatCode(() -> input.validateHeight(height))
                .doesNotThrowAnyException();
    }
}
