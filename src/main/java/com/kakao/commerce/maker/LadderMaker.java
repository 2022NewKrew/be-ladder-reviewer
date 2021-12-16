package com.kakao.commerce.maker;

import java.util.ArrayList;
import java.util.List;

import com.kakao.commerce.domain.Ladder;
import com.kakao.commerce.domain.Line;

public class LadderMaker {

    private final LineMaker lineMaker = new LineMaker();

    public Ladder makeLadder(int peopleCount, int height) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(lineMaker.makeLine(peopleCount));
        }

        return new Ladder(lines);
    }
}
