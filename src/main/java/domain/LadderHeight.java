package domain;

import java.util.Objects;

public class LadderHeight {
    private final int ladderHeight;

    public LadderHeight(int ladderHeight) {
        this.ladderHeight = ladderHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderHeight that = (LadderHeight) o;
        return ladderHeight == that.ladderHeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ladderHeight);
    }
}
