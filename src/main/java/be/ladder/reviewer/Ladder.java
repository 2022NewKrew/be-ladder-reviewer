package be.ladder.reviewer;

import java.util.List;

public class Ladder {
    private final List<LadderEntry> entries;

    public Ladder(List<LadderEntry> entries) {
        if(entries.size() <= 0) {
            throw new IllegalArgumentException("entries.size must be positive");
        }

        this.entries = entries;
    }

    public List<LadderEntry> entries() {
        return entries;
    }
}
