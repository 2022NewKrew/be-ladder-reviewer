package com.kakao.study.ladder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    public List<Line> lines;
    public Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public static Ladder initialize(int count, int height) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0 ; i < count ; i++) {
            lines.add(Line.initialize(height));
        }

        return new Ladder(lines);
    }

    public boolean existLine(int row, int col) {
        return lines.get(row).existPosition(col);
    }
}
