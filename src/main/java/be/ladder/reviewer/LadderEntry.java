package be.ladder.reviewer;

import java.util.List;

public class LadderEntry {
    private final List<Boolean> lines;

    public LadderEntry(List<Boolean> lines) {
        if (lines.size() <= 0) {
            throw new IllegalArgumentException("lines.size must be positive");
        }

        this.lines = lines;
    }

    public List<Boolean> lines() {
        return lines;
    }

    public Boolean compatible(LadderEntry other) {
        return this.lines.size() == other.lines.size();
    }
}
