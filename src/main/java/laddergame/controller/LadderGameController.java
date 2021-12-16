package laddergame.controller;

import laddergame.domain.ladder.Ladder;
import laddergame.dto.LadderDto;

public class LadderGameController {
    public LadderDto constructLadder(int participantNumber, int ladderHeight) {
        Ladder ladder = new Ladder(participantNumber, ladderHeight);
        return new LadderDto(ladder);
    }
}
