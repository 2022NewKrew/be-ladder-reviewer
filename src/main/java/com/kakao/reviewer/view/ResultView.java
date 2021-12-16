package com.kakao.reviewer.view;

import com.kakao.reviewer.domain.Ladder;
import com.kakao.reviewer.domain.Point;
import com.kakao.reviewer.domain.Row;

public class ResultView {
    private static final String BRIDGE_MARK = "-";
    private static final String EMPTY_MARK = " ";
    private static final String ROD_MARK = "|";

    public static void printLadder(Ladder ladder) {
        for (Row row : ladder.getRows()) {
            printRow(row);
            System.out.println();
        }
    }

    private static void printRow(Row row) {
        System.out.print(ROD_MARK);
        for (Point point : row.getPoints()) {
            printPoint(point);
            System.out.print(ROD_MARK);
        }
    }

    private static void printPoint(Point point) {
        System.out.print(getPointMark(point));
    }

    private static String getPointMark(Point point) {
        if (point.isBridge()) {
            return BRIDGE_MARK;
        }
        return EMPTY_MARK;
    }
}
