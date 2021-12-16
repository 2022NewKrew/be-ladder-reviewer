package com.kakao.domain;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class LadderFactory {

    private LadderFactory() {}

    public static Ladder create(HeadCount headCount, Height height) {
        List<LadderRow> ladder = createLadder(headCount, height);
        return new Ladder(ladder);
    }

    private static List<LadderRow> createLadder(HeadCount headCount, Height height) {
        return IntStream.range(0, height.getValue())
                        .mapToObj(idx -> createLadderRow(headCount))
                        .collect(Collectors.toList());
    }

    private static LadderRow createLadderRow(HeadCount headCount) {
        int rowSize = headCount.getValue() - 1;
        return new LadderRow(RowGenerator.generate(rowSize));
    }
}
