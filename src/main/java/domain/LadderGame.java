package domain;

import java.util.List;

public class LadderGame {
    private final Ladder ladder;

    public LadderGame(int numberOfParticipants, int height) {
        this.ladder = Ladder.of(numberOfParticipants, height);
    }

    public LadderGame(Ladder ladder) {
        this.ladder = ladder;
    }

    public int height() {
        return ladder.height();
    }

    public List<Boolean> nextLine(int level) {
        return ladder.line(level);
    }
}
