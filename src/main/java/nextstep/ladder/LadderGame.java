package nextstep.ladder;


import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.line.RandomLineStrategy;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.OutputView;

public class LadderGame {
    public static void main(String[] args) {
        final int playerCount = InputView.inputNumber("참여할 사람은 몇 명인가요?");
        final int height = InputView.inputNumber("최대 사다리 높이는 몇 개인가요?");
        final Ladder ladder = Ladder.of(playerCount, height, new RandomLineStrategy());

        OutputView.printLadder(ladder);
    }
}
