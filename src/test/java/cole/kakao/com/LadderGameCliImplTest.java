package cole.kakao.com;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LadderGameCliImplTest {

    @Test
    void testInputNumParticipants_whenNumParticipants3_then3() {

        // given
        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n5".getBytes());
        System.setIn(inputStream);

        LadderGame ladderGame = new LadderGameCliImpl();

        // when
        LadderGame.LadderGameParams actual = ladderGame.inputGameParams(inputStream);

        // then
        assertEquals(3, actual.numParticipants);
    }

    @Test
    void testInputMaxLadderHeight_whenMaxLadderHeight3_then3() {

        // given
        ByteArrayInputStream inputStream = new ByteArrayInputStream("1\n3".getBytes());
        System.setIn(inputStream);

        LadderGame ladderGame = new LadderGameCliImpl();

        // when
        LadderGame.LadderGameParams actual = ladderGame.inputGameParams(inputStream);

        // then
        assertEquals(3, actual.maxLadderHeight);
    }
}
