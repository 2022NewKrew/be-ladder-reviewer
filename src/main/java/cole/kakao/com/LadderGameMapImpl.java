package cole.kakao.com;

import java.time.Instant;
import java.util.Random;

class LadderGameMapImpl implements LadderGameMap {

    private final int maxLadderHeight;
    private final int numParticipants;
    private final Random random;
    private final Ladder[][] ladders;

    public LadderGameMapImpl(int numParticipants, int maxLadderHeight, long seed) {
        this.maxLadderHeight = maxLadderHeight;
        this.numParticipants = numParticipants;
        this.random = new Random() {{
            setSeed(seed);
        }};
        this.ladders = new Ladder[maxLadderHeight][numParticipants - 1];
        this.generate();
    }

    public LadderGameMapImpl(int numParticipants, int maxLadderHeight) {
        this(numParticipants, maxLadderHeight, Instant.now().toEpochMilli());
    }

    private void generate() {
        for (int i = 0; i < maxLadderHeight; ++i) {
           generateNthRowLadders(i);
        }
    }

    @Override
    public Ladder[][] getLadderMap() {
        return ladders;
    }

    private void generateNthRowLadders(int n) {
        for (int column = 0; column < numParticipants - 1; ++column) {
            ladders[n][column] = randomLadder();
        }
    }

    private Ladder randomLadder() {
        if (random.nextInt() % 2 == 0) {
            return Ladder.NONE;
        } else {
            return Ladder.EXISTS;
        }
    }
}
