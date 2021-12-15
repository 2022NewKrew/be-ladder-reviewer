package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class LadderLines {
    private final List<LadderLine> ladderLines;

    public LadderLines(List<LadderLine> ladderLines) {
        this.ladderLines = ladderLines;
    }

    public static LadderLines createLadderLines(UserCount userCount, LadderHeight ladderHeight) {
        List<LadderLine> ladderLines = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < ladderHeight.getLadderHeight(); i++) {
            ladderLines.add(new LadderLine(userCount.getUserCount(), random));
        }
        return new LadderLines(ladderLines);
    }

    public List<LadderLine> getLadderLines() {
        return ladderLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderLines that = (LadderLines) o;
        return Objects.equals(ladderLines, that.ladderLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ladderLines);
    }
}
