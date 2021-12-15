package com.kakao.ladder;

import com.kakao.ladder.adapter.in.console.LadderInputConsole;
import com.kakao.ladder.adapter.in.web.LadderController;
import com.kakao.ladder.adapter.out.console.LadderConsoleAdapter;
import com.kakao.ladder.adapter.out.console.LadderOutputConsole;
import com.kakao.ladder.application.service.LadderService;
import com.kakao.ladder.domain.factory.LineFactory;

public class LadderApplication {
    public static void main(String[] args) {
        LadderInputConsole ladderInputConsole = new LadderInputConsole();
        LadderController ladderController
                = new LadderController(new LadderService(new LineFactory(),
                                                         new LadderConsoleAdapter(new LadderOutputConsole())));

        int numberOfParticipant = ladderInputConsole.inputNumberOfParticipant();
        int heightOfLadder = ladderInputConsole.inputHeightOfLadder();

        ladderController.createLadder(numberOfParticipant, heightOfLadder);
    }
}
