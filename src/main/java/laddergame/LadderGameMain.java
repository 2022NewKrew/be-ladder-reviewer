package laddergame;

import laddergame.controller.LadderGameController;
import laddergame.dto.LadderDto;
import laddergame.view.InputView;
import laddergame.view.OutputView;

public class LadderGameMain {
    public static void main(String[] args) {
        LadderGameController ladderGameController = new LadderGameController();
        LadderDto ladderDto =
                ladderGameController.constructLadder(InputView.inputParticipantNumber(), InputView.inputLadderHeight());
        OutputView.printLadder(ladderDto);
    }
}
