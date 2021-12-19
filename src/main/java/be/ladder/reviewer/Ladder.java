package be.ladder.reviewer;

import java.util.List;

public class Ladder {
    private final List<LadderEntry> entries;

    public Ladder(List<LadderEntry> entries) {
        if(entries.size() <= 0) {
            throw new IllegalArgumentException("entries.size must be positive");
        }

        if(!entries.stream().allMatch(entry -> entry.compatible(entries.get(0)))) {
            throw new IllegalArgumentException("entries are not compatible");
        }

        this.entries = entries;
    }

    public List<LadderEntry> entries() {
        return entries;
    }
}
