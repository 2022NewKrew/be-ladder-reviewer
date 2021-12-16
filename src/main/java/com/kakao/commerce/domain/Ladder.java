package com.kakao.commerce.domain;

import java.util.List;

public class Ladder implements Drawable {

    private final List<Line> lines;

    public Ladder(List<Line> lines) {
        this.lines = lines;
    }

    @Override
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}
