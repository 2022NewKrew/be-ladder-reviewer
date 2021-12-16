package com.kakao.commerce.minialice.laddergame.util;


import com.kakao.commerce.minialice.laddergame.dto.Ladder;
import com.kakao.commerce.minialice.laddergame.dto.LadderBody;
import com.kakao.commerce.minialice.laddergame.dto.LadderFootboard;

public class LadderPrinter {
    private static final String SHAFT = "|";
    private static final String FOOTBOARD = "-";
    private static final String EMPTY_FOOTBOARD = " ";

    public static void print(Ladder ladder) {
        for (LadderBody ladderBody : ladder.getLadderBodies()) {
            System.out.print(SHAFT);
            for (LadderFootboard footboard : ladderBody.getLadderFootboards()) {
                if (footboard.isUse()) {
                    System.out.print(FOOTBOARD);
                } else {
                    System.out.print(EMPTY_FOOTBOARD);
                }
                System.out.print(SHAFT);
            }
            System.out.println();
        }
    }
}
