import domain.Ladder;
import view.InputView;
import view.ResultView;

public class Application {

    public static void main(String[] args) {
        int playerCount = InputView.readPlayerCount();
        int ladderHeight = InputView.readLadderHeight();

        Ladder ladder = Ladder.create(playerCount, ladderHeight);

        ResultView.printLines(ladder.getLines());
    }
}
