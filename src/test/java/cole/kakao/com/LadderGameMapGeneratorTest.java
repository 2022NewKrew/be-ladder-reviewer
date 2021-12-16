package cole.kakao.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderGameMapGeneratorTest {


    @Test
    void testLadderGameMap_givenSeed0_thenGameMap() {
        // given
        int numParticipants = 3;
        int maxLadderHeight = 5;
        int seed = 0;

        // when
        LadderGameMapGenerator ladderGameMapGenerator = new LadderGameMapGeneratorImpl(numParticipants, maxLadderHeight, seed);
        String actual = ladderGameMapGenerator.generate();

        // then
        assertEquals(
                "| | |\n" +
                        "| | |\n" +
                        "| | |\n" +
                        "|-|-|\n" +
                        "| |-|",
                actual);
    }

    @Test
    void testLadderGameMap_givenSeed1_thenGameMap() {
        // given
        int numParticipants = 5;
        int maxLadderHeight = 7;
        int seed = 1;

        // when
        LadderGameMapGenerator ladderGameMapGenerator = new LadderGameMapGeneratorImpl(numParticipants, maxLadderHeight, seed);
        String actual = ladderGameMapGenerator.generate();

        // then
        assertEquals(
                "|-| |-| |\n" +
                        "| | |-|-|\n" +
                        "|-| | | |\n" +
                        "| | | | |\n" +
                        "|-| |-|-|\n" +
                        "|-| |-| |\n" +
                        "| | | |-|",
                actual);
    }
}

