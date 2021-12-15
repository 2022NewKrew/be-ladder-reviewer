package service;

import domain.LadderHeight;
import domain.UserCount;

import java.util.Objects;

public class LadderService {
    private final UserCount userCount;
    private final LadderHeight ladderHeight;

    public LadderService(UserCount userCount, LadderHeight ladderHeight) {
        this.userCount = userCount;
        this.ladderHeight = ladderHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderService that = (LadderService) o;
        return Objects.equals(userCount, that.userCount) &&
                Objects.equals(ladderHeight, that.ladderHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCount, ladderHeight);
    }
}
