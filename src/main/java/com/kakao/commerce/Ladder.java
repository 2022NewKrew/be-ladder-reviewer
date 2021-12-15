package com.kakao.commerce;

import java.util.List;

public class Ladder {

    private final int peopleCount;
    private final int height;

    private final List<Line> lines;

    public Ladder(int peopleCount, int height, List<Line> lines) {
        this.peopleCount = peopleCount;
        this.height = height;
        this.lines = lines;
    }

    public void draw() {
        for (Line line : lines) {
            line.drawLine();
        }
    }
}
