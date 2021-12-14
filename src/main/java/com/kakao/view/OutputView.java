package com.kakao.view;

import com.kakao.view.dto.LadderDto;

public final class OutputView {

    private OutputView() {}

    public static void printLadder(LadderDto ladder) {
        for (int i = 0; i < ladder.getHeight(); i++) {
            printOneLine(ladder.getHeadCount(), ladder.getLadderIndex().get(i));
        }
    }

    private static void printOneLine(int headCount, int ladderIndex) {
        for (int i = 0; i < headCount; i++) {
            System.out.print("| ");
            printLadderCross(ladderIndex, i);
        }
        System.out.println();
    }

    private static void printLadderCross(int ladderIndex, int i) {
        if (ladderIndex == i) {
            System.out.print("- ");
        } else {
            System.out.print("  ");
        }
    }
}
