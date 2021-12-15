package com.kakao.ladder.adapter.out;

import com.kakao.ladder.domain.Ladder;
import com.kakao.ladder.domain.Line;

public class LadderOutputConsole {
    private static final String LADDER_PART1 = "-----|";
    private static final String LADDER_PART2 = "     |";
    private static final String ENTER = "\r\n";

    public void printLadder(Ladder ladder) {
        StringBuilder sb = new StringBuilder();
        printLadder(sb, ladder);

        System.out.println(sb);
    }

    private void printLadder(StringBuilder sb, Ladder ladder) {
        ladder.getLines().forEach(line -> {
            sb.append(ENTER);
            printLine(sb, line);
        });
    }

    private void printLine(StringBuilder sb, Line line) {
        line.getPoints().forEach(point -> {
            String result = Boolean.TRUE.equals(point) ? LADDER_PART1 : LADDER_PART2;
            sb.append(result);
        });
    }
}
