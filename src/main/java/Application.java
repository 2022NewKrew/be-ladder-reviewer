import domain.Ladder;
import domain.LadderMachine;
import domain.RandomPointGenerator;
import view.InputView;
import view.ResultView;

public class Application {

    public static void main(String[] args) {
        int countOfPlayer = InputView.readPlayers();
        int ladderHeight = InputView.readLadderHeight();

        LadderMachine ladderMachine = LadderMachine.create(countOfPlayer, ladderHeight);
        Ladder ladder = ladderMachine.draw(new RandomPointGenerator());

        ResultView.printLines(ladder);
    }
}
