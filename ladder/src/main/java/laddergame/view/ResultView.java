package laddergame.view;

import java.util.List;

import laddergame.model.Line;
import laddergame.model.Point;

public final class ResultView {

    private static final StringBuilder stringBuilder = new StringBuilder();

    private static final String VERTICAL = "|";
    private static final String LINE = "-";
    private static final String EMPTY = " ";

    private ResultView() {
    }

    public static void printLadder(List<Line> ladder) {
        stringBuilder.setLength(0);
        stringBuilder.append('\n');
        ladder.forEach(line -> printLine(line));

        System.out.println(stringBuilder);
    }

    private static void printLine(Line line) {
        line.getPoints()
            .forEach(point -> printPoint(point));
        stringBuilder.append('|')
                     .append('\n');
    }

    private static StringBuilder printPoint(Point point) {
        stringBuilder.append(VERTICAL);
        String line = point.exist() ? LINE : EMPTY;
        stringBuilder.append(line);
        return stringBuilder;
    }
}
