package laddergame.dto;

import laddergame.domain.ladder.Ladder;

import java.util.List;

public class LadderDto {
    private final List<String> ladderOutput;

    public LadderDto(Ladder ladder) {
        this.ladderOutput = ladder.toStringList();
    }

    public List<String> getLadderOutput() {
        return ladderOutput;
    }
}
