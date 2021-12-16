package nextstep.ladder.view;

import java.util.stream.Collectors;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Line;

public class OutputView {
    private static final int SPACE_WIDTH = 1;
    private static final String NEWLINE = "\n";
    private static final String NOTHING = " ";
    private static final String LINE = "-";
    private static final String RAIL = "|";

    public static void printLadder(Ladder ladder) {
        ladder.stream()
                .map(OutputView::formatLine)
                .forEach(System.out::println);
    }

    public static String formatLine(Line line) {
        return NOTHING.repeat(SPACE_WIDTH) + RAIL + mapLine(line) + RAIL;
    }

    public static String mapLine(Line line) {
        return line.stream()
                .map(OutputView::mapPoint)
                .collect(Collectors.joining(RAIL));

    }

    public static String mapPoint(boolean isPoint) {
        String point = isPoint ? LINE : NOTHING;
        return point.repeat(SPACE_WIDTH);
    }
}
