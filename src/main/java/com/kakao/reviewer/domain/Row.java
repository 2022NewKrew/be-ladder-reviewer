package com.kakao.reviewer.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Row {
    private final List<Point> points;

    public Row(int memberSize) {
        this.points = IntStream.range(0, memberSize - 1)
                .mapToObj(i -> new Point())
                .collect(Collectors.toList());
    }

    public List<Point> getPoints() {
        return points;
    }
}
