package com.kakao.ladder.adapter.in.web;

import com.kakao.ladder.application.port.in.LadderCommand;
import com.kakao.ladder.application.port.in.LadderUseCase;

public class LadderController {
    private final LadderUseCase ladderUseCase;

    public LadderController(LadderUseCase ladderUseCase) {
        this.ladderUseCase = ladderUseCase;
    }

    public void createLadder(int numberOfParticipant, int heightOfLadder) {
        ladderUseCase.createLadder(LadderCommand.of(numberOfParticipant, heightOfLadder));
    }
}
