package com.kakao.commerce.domain;

import java.util.List;

public class Ladder {

    private final List<Line> lines;

    public Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public void draw() {
        for (Line line : lines) {
            line.drawLine();
        }
    }
}
