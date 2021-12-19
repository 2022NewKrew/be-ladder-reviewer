package be.ladder.reviewer;

import java.util.List;

public class LadderEntry {
    private final int numOfParticipants;
    private final List<Boolean> lines;

    public LadderEntry(int numOfParticipants, List<Boolean> lines) {
        if (numOfParticipants <= 1 || lines.size() != numOfParticipants - 1) {
            throw new IllegalArgumentException("invalid ladder entry. numOfParticipants: " + numOfParticipants + ", lines.size: " + lines.size());
        }

        this.numOfParticipants = numOfParticipants;
        this.lines = lines;
    }

    public List<Boolean> lines() {
        return lines;
    }
}
