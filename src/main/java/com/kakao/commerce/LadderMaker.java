package com.kakao.commerce;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {

    private final LineMaker lineMaker = new LineMaker();

    public Ladder makeLadder(int peopleCount, int height) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(lineMaker.makeLine(peopleCount));
        }

        return new Ladder(peopleCount, height, lines);
    }
}
