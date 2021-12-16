package com.kakao.view;

import java.util.List;

import com.kakao.view.dto.LadderDto;

public final class OutputView {

    private OutputView() {}

    public static void printLadder(LadderDto ladder) {
        List<List<Boolean>> isCross = ladder.getIsCross();
        int height = isCross.size();
        for (int i = 0; i < height; i++) {
            printOneLine(isCross.get(i));
        }
    }

    private static void printOneLine(List<Boolean> isCross) {
        int crossSize = isCross.size();
        System.out.print("| ");
        for (int i = 0; i < crossSize; i++) {
            printLadderCross(isCross.get(i));
            System.out.print("| ");
        }
        System.out.println();
    }

    private static void printLadderCross(boolean isCross) {
        if (isCross) {
            System.out.print("- ");
        } else {
            System.out.print("  ");
        }
    }
}
