package cole.kakao.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LadderGameMapImplTest {

    @Test
    void testGetLadders_givenSeed0_thenGameMap() {
        // given
        int numParticipants = 3;
        int maxLadderHeight = 5;
        int seed = 0;

        // when
        LadderGameMap ladderGameMap = new LadderGameMapImpl(numParticipants, maxLadderHeight, seed);
        Ladder[][] actual = ladderGameMap.getLadderMap();

        // then
        assertArrayEquals(new Ladder[]{Ladder.NONE, Ladder.NONE}, actual[0]);
        assertArrayEquals(new Ladder[]{Ladder.NONE, Ladder.NONE}, actual[1]);
        assertArrayEquals(new Ladder[]{Ladder.NONE, Ladder.NONE}, actual[2]);
        assertArrayEquals(new Ladder[]{Ladder.EXISTS, Ladder.EXISTS}, actual[3]);
    }

    @Test
    void testGetLadders_givenSeed1_thenGameMap() {
        // given
        int numParticipants = 5;
        int maxLadderHeight = 7;
        int seed = 1;

        // when
        LadderGameMap ladderGameMap = new LadderGameMapImpl(numParticipants, maxLadderHeight, seed);
        Ladder[][] actual = ladderGameMap.getLadderMap();

        // then
        assertArrayEquals(new Ladder[]{Ladder.EXISTS, Ladder.NONE, Ladder.EXISTS, Ladder.NONE}, actual[0]);
        assertArrayEquals(new Ladder[]{Ladder.NONE, Ladder.NONE, Ladder.EXISTS, Ladder.EXISTS}, actual[1]);
        assertArrayEquals(new Ladder[]{Ladder.EXISTS, Ladder.NONE, Ladder.NONE, Ladder.NONE}, actual[2]);
        assertArrayEquals(new Ladder[]{Ladder.NONE, Ladder.NONE, Ladder.NONE, Ladder.NONE}, actual[3]);
        assertArrayEquals(new Ladder[]{Ladder.EXISTS, Ladder.NONE, Ladder.EXISTS, Ladder.EXISTS}, actual[4]);
        assertArrayEquals(new Ladder[]{Ladder.EXISTS, Ladder.NONE, Ladder.EXISTS, Ladder.NONE}, actual[5]);
        assertArrayEquals(new Ladder[]{Ladder.NONE, Ladder.NONE, Ladder.NONE, Ladder.EXISTS}, actual[6]);
    }
}

