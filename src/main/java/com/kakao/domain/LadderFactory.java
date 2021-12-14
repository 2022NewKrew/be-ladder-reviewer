package com.kakao.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class LadderFactory {

    private LadderFactory() {}

    public static Ladder create(HeadCount headCount, Height height) {
        List<LadderCross> ladderCrosses = createLadderCrosses(headCount, height);
        return new Ladder(headCount, height, new LadderCrosses(ladderCrosses));
    }

    private static List<LadderCross> createLadderCrosses(HeadCount headCount, Height height) {
        return IntStream.range(0, height.getValue())
                        .mapToObj(idx -> createLadderCross(headCount))
                        .collect(Collectors.toList());
    }

    private static LadderCross createLadderCross(HeadCount headCount) {
        int left = RandomGenerator.create(0, headCount.getValue() - 1);
        return LadderCross.of(left);
    }
}
