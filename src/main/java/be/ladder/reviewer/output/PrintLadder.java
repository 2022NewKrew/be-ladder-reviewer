package be.ladder.reviewer.output;

import be.ladder.reviewer.Ladder;
import be.ladder.reviewer.LadderEntry;

import java.util.List;
import java.util.stream.Collectors;

public class PrintLadder {
    private static final String LINE = "-";
    private static final String BLANK_LINE = " ";
    private static final String VERTICAL_LINE = "|";

    public void print(Ladder ladder) {
        ladder.entries().forEach(this::printEntry);
    }

    private void printEntry(LadderEntry entry) {
        List<String> lines = entry.lines().stream().map(this::convertLineToString).collect(Collectors.toList());
        System.out.print(VERTICAL_LINE);
        System.out.print(String.join(VERTICAL_LINE, lines));
        System.out.println(VERTICAL_LINE);
    }

    private String convertLineToString(Boolean line) {
        if (!line) {
            return BLANK_LINE;
        }

        return LINE;
    }
}
