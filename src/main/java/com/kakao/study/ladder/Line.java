package com.kakao.study.ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Boolean> positions;

    public Line(List<Boolean> positions) {
        this.positions = positions;
    }

    public static Line initialize(int height) {
        List<Boolean> positions = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < height ; i++) {
            positions.add(random.nextBoolean());
        }

        return new Line(positions);
    }

    public boolean existPosition(int position) {
        return positions.get(position);
    }
}
