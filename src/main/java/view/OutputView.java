package view;

import domain.LadderLines;

public class OutputView {
    public static void drawLadderLines(LadderLines ladderLines) {
        System.out.println();
        ladderLines.getLadderLines().stream()
                .forEach(ladderLine -> System.out.println(ladderLine.getResultLine()));
    }
}
