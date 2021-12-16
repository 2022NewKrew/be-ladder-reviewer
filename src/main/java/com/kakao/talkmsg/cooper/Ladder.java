package com.kakao.talkmsg.cooper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private static final int MIN_HEIGHT = 1;
    private List<Line> lines;

    public Ladder(int numOfPeople, int height) {
        if (height < MIN_HEIGHT) {
            throw new IllegalArgumentException();
        }
        initLines(numOfPeople, height);
    }

    private void initLines(int numOfPeople, int height) {
        this.lines = IntStream.range(0, height).mapToObj(num -> new Line(numOfPeople)).collect(Collectors.toList());
    }

    public List<Line> getLine() {
        return Collections.unmodifiableList(this.lines);
    }

    public int getWidth() {
        return lines.get(0).getEdgeSize();
    }

    public int getHeight() {
        return lines.size();
    }
}
