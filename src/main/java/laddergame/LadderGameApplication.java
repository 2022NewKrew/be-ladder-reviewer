package laddergame;

import laddergame.domain.ladder.Ladder;
import laddergame.domain.player.Players;
import laddergame.view.InputView;
import laddergame.view.ResultView;

public class LadderGameApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();

        Players players = inputView.inputParticipantsCount();
        int ladderHeight = inputView.inputLadderHeight();

        Ladder ladder = new Ladder(players, ladderHeight);

        ResultView outputView = new ResultView(ladder);
        outputView.printLadder();
    }

}
