package be.ladder.reviewer;

import java.util.*;

public class RandomLadder {
    private Random random;

    public RandomLadder(Random random) {
        this.random = random;
    }

    public Ladder build(NumOfParticipants numOfParticipants, Height height) {
        List<LadderEntry> entries = new ArrayList<>();
        for (int i = 0; i < height.value(); i++) {
            entries.add(buildEntry(numOfParticipants));
        }
        return new Ladder(Collections.unmodifiableList(entries));
    }

    private LadderEntry buildEntry(NumOfParticipants numOfParticipants) {
        List<Boolean> lines = new ArrayList<>();
        for (int i = 0; i < numOfParticipants.numOfLinesInLadderEntry(); i++) {
            lines.add(random.nextBoolean());
        }
        return new LadderEntry(Collections.unmodifiableList(lines));
    }
}
