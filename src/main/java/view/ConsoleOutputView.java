package view;

import domain.LadderGame;

import java.util.List;

public class ConsoleOutputView implements OutputView {
    private static final String STAIR_EXIST = "-";
    private static final String NO_STAIR = " ";
    private static final String VERTICAL_BAR = "|";
    private static final String INITIAL_EMPTY_SPACE = "  ";

    @Override
    public void showLadderGame(LadderGame ladderGame) {
        for (int i = 0; i < ladderGame.height(); i++) {
            String line = showLadderLine(ladderGame.nextLine(i));
            System.out.println(line);
        }
    }

    private String showLadderLine(List<Boolean> line) {
        return line.stream()
                .map(this::getLineExpression)
                .reduce(INITIAL_EMPTY_SPACE + VERTICAL_BAR, (accumulator, stair) ->
                        accumulator + stair + VERTICAL_BAR
                );
    }

    private String getLineExpression(boolean isExist) {
        return isExist ? STAIR_EXIST : NO_STAIR;
    }
}
