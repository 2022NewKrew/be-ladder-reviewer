package com.kakao.ladder.adapter.out;

import com.kakao.ladder.application.port.out.LadderOutput;
import com.kakao.ladder.domain.Ladder;

public class LadderConsoleAdapter implements LadderOutput {
    private final LadderOutputConsole ladderOutputConsole;

    public LadderConsoleAdapter(LadderOutputConsole ladderOutputConsole) {
        this.ladderOutputConsole = ladderOutputConsole;
    }

    public void printLadder(Ladder ladder) {
        ladderOutputConsole.printLadder(ladder);
    }
}
