package com.kakao.reviewer.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private final List<Row> rows;

    public Ladder(int memberSize, int height) {
        this.rows = IntStream.range(0, height)
                .mapToObj(i -> new Row(memberSize))
                .collect(Collectors.toList());
    }

    public List<Row> getRows() {
        return rows;
    }
}
