package com.kakao.nio.ladder.domain.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderLineCreator {

    public static List<LadderLine> create(int numOfMembers, int numOfLines) {
        if (numOfLines < 1) throw new IllegalArgumentException("사다리 라인은 최소 1이상 이어야 합니다");
        return IntStream.range(0, numOfLines)
                .mapToObj(idx -> LadderLine.init(numOfMembers))
                .collect(Collectors.toList());
    }

}
