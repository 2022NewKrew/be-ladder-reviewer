package com.kakao.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LineMaker {

    private static final String EMPTY_BLOCK = " ";
    private static final String HORIZONTAL_BLOCK = "-";
    private static final String VERTICAL_BLOCK = "|";

    private static final Random random = new Random(System.currentTimeMillis());

    public Line makeLine(int peopleCount) {
        List<String> blocks = new ArrayList<>();

        boolean isNearHorizontal = false;

        for (int person = 0; person < peopleCount*2-1; person++) {
            if (person % 2 == 0) {
                blocks.add(VERTICAL_BLOCK);
                continue;
            }

            String block = decideHorizontalBlock(isNearHorizontal);
            blocks.add(block);
            isNearHorizontal = HORIZONTAL_BLOCK.equals(block);
        }

        return new Line(blocks);
    }

    private String decideHorizontalBlock(boolean isNearHorizontal) {
        if (isNearHorizontal) {
            return EMPTY_BLOCK;
        }

        return random.nextBoolean() ? HORIZONTAL_BLOCK : EMPTY_BLOCK;
    }
}
