import domain.LadderHeight;
import domain.LadderLines;
import domain.UserCount;
import view.InputView;
import view.OutputView;

public class LadderMain {
    public static void main(String[] args)  {
        int count = InputView.inputUserCount();
        int height = InputView.inputLadderHeight();
        UserCount userCount = new UserCount(count);
        LadderHeight ladderHeight = new LadderHeight(height);
        LadderLines ladderLines = LadderLines.createLadderLines(userCount, ladderHeight);
        OutputView.drawLadderLines(ladderLines);
    }
}
