package cole.kakao.com;

import java.time.Instant;
import java.util.Random;

class LadderGameMapGeneratorImpl implements LadderGameMapGenerator {

    private final int maxLadderHeight;
    private final int numParticipants;
    private final Random random;

    public LadderGameMapGeneratorImpl(int numParticipants, int maxLadderHeight) {
        this.maxLadderHeight = maxLadderHeight;
        this.numParticipants = numParticipants;
        this.random = new Random() {{
            setSeed(Instant.now().getEpochSecond());
        }};
    }

    public LadderGameMapGeneratorImpl(int numParticipants, int maxLadderHeight, long seed) {
        this.maxLadderHeight = maxLadderHeight;
        this.numParticipants = numParticipants;
        this.random = new Random() {{
            setSeed(seed);
        }};
    }

    @Override
    public String generate() {

        StringBuilder ladderGameMap = new StringBuilder();
        for (int i = 0; i < maxLadderHeight; ++i) {
            for (int j = 0; j < numParticipants * 2 - 1; ++j) {
                if (j % 2 == 1) {
                    ladderGameMap.append(randomHorizontalBar());
                } else {
                    ladderGameMap.append(VERTICAL_BAR);
                }
            }

            if (i != maxLadderHeight - 1) {
                ladderGameMap.append(END_OF_HORIZONTAL_LADDER);
            }
        }

        return ladderGameMap.toString();
    }

    private String randomHorizontalBar() {
        if (random.nextInt() % 2 == 0) {
            return HORIZONTAL_BAR_EMPTY;
        } else {
            return HORIZONTAL_BAR_EXISTS;
        }
    }
}
