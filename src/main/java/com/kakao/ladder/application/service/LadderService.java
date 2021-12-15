package com.kakao.ladder.application.service;

import com.kakao.ladder.application.port.in.LadderCommand;
import com.kakao.ladder.application.port.in.LadderUseCase;
import com.kakao.ladder.application.port.out.LadderOutput;
import com.kakao.ladder.domain.Ladder;
import com.kakao.ladder.domain.Line;
import com.kakao.ladder.domain.factory.LineFactory;

import java.util.List;

public class LadderService implements LadderUseCase {
    private final LineFactory lineFactory;
    private final LadderOutput ladderOutput;

    public LadderService(LineFactory lineFactory, LadderOutput ladderOutput) {
        this.lineFactory = lineFactory;
        this.ladderOutput = ladderOutput;
    }

    public void createLadder(LadderCommand ladderCommand) {
        List<Line> lines = lineFactory.createLines(ladderCommand.getNumberOfParticipant(),
                                                   ladderCommand.getHeightOfLadder());
        ladderOutput.printLadder(Ladder.of(lines));
    }
}
