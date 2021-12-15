package com.kakao.study.ladder.view;

import com.kakao.study.ladder.Ladder;

public class OutputView {
    public void printLadder(Ladder ladder, int countOfPlayer, int heightOfLadder) {
        for (int col = 0; col < heightOfLadder; col++) {
            printLine(ladder, countOfPlayer, col);
        }
    }

    private void printLine(Ladder ladder, int countOfPlayer, int col) {
        for (int row = 0; row < countOfPlayer -1; row++) {
            System.out.print("|");
            System.out.print(stringOfLine(ladder, row, col));
        }
        System.out.println("|");
    }

    private String stringOfLine(Ladder ladder, int row, int col) {
        if (ladder.existLine(row, col)) {
            return "-";
        }

        return " ";
    }
}
