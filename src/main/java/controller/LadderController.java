package controller;

import domain.LadderGame;
import view.ConsoleInputView;
import view.ConsoleOutputView;
import view.InputView;
import view.OutputView;

public class LadderController {
    private LadderController() {

    }

    public static void runGame() {
        InputView inputView = new ConsoleInputView();
        OutputView outputView = new ConsoleOutputView();

        int numberOfParticipants = inputView.getNumberOfParticipants();
        int heightOfLadder = inputView.getHeightOfLadder();

        LadderGame ladderGame = new LadderGame(numberOfParticipants, heightOfLadder);

        outputView.showLadderGame(ladderGame);
    }
}
