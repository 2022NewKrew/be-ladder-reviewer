package view;

import domain.Line;
import domain.Lines;
import domain.Point;

import java.util.Collections;

public class ResultView {

    private static final String LINE_FORMAT = "%5s|";
    private static final String EMPTY_DELIMITER = "";
    private static final String LINE_POINT = "-";

    public static void printLines(Lines lines) {
        lines.getLines().forEach(ResultView::printLine);
    }

    private static void printLine(Line line) {
        line.getPoints().stream()
                .map(ResultView::convertLineFormat)
                .forEach(System.out::print);

        printNewLine();
    }

    private static String convertLineFormat(Point point) {
        return String.format(
                LINE_FORMAT,
                String.join(EMPTY_DELIMITER, Collections.nCopies(point.isMovable() ? 5 : 0, LINE_POINT)));
    }

    private static void printNewLine() {
        System.out.println();
    }
}
