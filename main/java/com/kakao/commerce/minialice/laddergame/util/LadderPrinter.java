package com.kakao.commerce.minialice.laddergame.util;


import com.kakao.commerce.minialice.laddergame.dto.Ladder;
import com.kakao.commerce.minialice.laddergame.dto.LadderBody;
import com.kakao.commerce.minialice.laddergame.dto.LadderFootboard;

public class LadderPrinter {
    private static final String SHAFT = "|";
    private static final String FOOTBOARD = "-";
    private static final String EMPTY_FOOTBOARD = " ";
    private static final String LINE_SEPARATOR = System.lineSeparator();

    public static void print(Ladder ladder) {
        StringBuilder ladderTextBuilder = new StringBuilder();
        for (LadderBody ladderBody : ladder.getLadderBodies()) {
            ladderTextBuilder.append(SHAFT);
            addFootboardText(ladderBody, ladderTextBuilder);
            ladderTextBuilder.append(LINE_SEPARATOR);
        }
        System.out.println(ladderTextBuilder);
    }

    private static void addFootboardText(LadderBody ladderBody, StringBuilder ladderTextBuilder) {
        for (LadderFootboard footboard : ladderBody.getLadderFootboards()) {
            if (footboard.isUse()) {
                ladderTextBuilder.append(FOOTBOARD).append(SHAFT);
            } else {
                ladderTextBuilder.append(EMPTY_FOOTBOARD).append(SHAFT);
            }
        }
    }
}
