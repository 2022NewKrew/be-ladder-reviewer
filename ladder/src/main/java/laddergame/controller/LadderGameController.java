package laddergame.controller;

import laddergame.model.Ladder;
import laddergame.view.InputView;
import laddergame.view.ResultView;

public class LadderGameController {

    public void start() {
        int participantsCount = InputView.acceptParticipants();
        Ladder ladder = new Ladder(participantsCount, InputView.acceptMaxLadderHeight());

        ResultView.printLadder(ladder.getLines());
    }
}
