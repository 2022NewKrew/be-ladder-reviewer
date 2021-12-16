package com.kakao.commerce.maker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kakao.commerce.domain.Line;
import com.kakao.commerce.utils.NumberUtils;

public class LineMaker {

    private static final String EMPTY_BLOCK = " ";
    private static final String HORIZONTAL_BLOCK = "-";
    private static final String VERTICAL_BLOCK = "|";

    private static final Random random = new Random(System.currentTimeMillis());

    public Line makeLine(int peopleCount) {
        List<String> blocks = new ArrayList<>();
        boolean isFrontHorizontal = false;

        for (int person = 0; person < peopleCount*2-1; person++) {
            String block = getBlock(person, isFrontHorizontal);
            blocks.add(block);

            isFrontHorizontal = NumberUtils.isOdd(person) ? HORIZONTAL_BLOCK.equals(block) : isFrontHorizontal;
        }

        return new Line(blocks);
    }

    private String getBlock(int person, boolean isNearHorizontal) {
        if (NumberUtils.isEven(person)) {
            return VERTICAL_BLOCK;
        }
        return getHorizontalBlock(isNearHorizontal);
    }

    private String getHorizontalBlock(boolean isNearHorizontal) {
        if (isNearHorizontal) {
            return EMPTY_BLOCK;
        }
        return random.nextBoolean() ? HORIZONTAL_BLOCK : EMPTY_BLOCK;
    }
}
