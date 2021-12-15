package ladder;

import ladder.domain.Ladder;
import ladder.strategy.MovingStrategy;
import ladder.strategy.RandomMovingStrategy;
import ladder.view.InputView;
import ladder.view.ResultView;

public class LadderGame {
    public static void play() {
        InputView inputView = new InputView();
        int participantSize = inputView.getParticipantSize();
        int height = inputView.getLadderHeight();

        MovingStrategy movingStrategy = new RandomMovingStrategy();
        Ladder ladder = new Ladder(height, participantSize, movingStrategy);

        ResultView resultView = new ResultView();
        resultView.printLadder(ladder);
    }
}
