package be.ladder.reviewer;

import java.util.*;

public class RandomLadder {
    private Random random;

    public RandomLadder(Random random) {
        this.random = random;
    }

    public Ladder build(int numOfParticipants, int height) {
        List<LadderEntry> entries = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            entries.add(buildEntry(numOfParticipants));
        }
        return new Ladder(Collections.unmodifiableList(entries));
    }

    private LadderEntry buildEntry(int numOfParticipants) {
        List<Boolean> lines = new ArrayList<>();
        for (int i = 0; i < numOfParticipants - 1; i++) {
            lines.add(random.nextBoolean());
        }
        return new LadderEntry(Collections.unmodifiableList(lines));
    }
}
