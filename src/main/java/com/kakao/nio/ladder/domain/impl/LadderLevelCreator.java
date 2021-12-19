package com.kakao.nio.ladder.domain.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * LadderImpl 을 구성하는 LadderLevel 을 생성하는 Creator
 *
 * 사다리에 참가할 구성원 수와 사다리 height 를 입력하면 그에 맞는 LadderLevel List 를 생성합니다
 */
public class LadderLevelCreator {

    private static int MIN_HEIGHT = 1;

    public static List<LadderLevel> create(int numOfMembers, int height) {
        if (height < MIN_HEIGHT) throw new IllegalArgumentException("사다리 높이는 최소 1이상 이어야 합니다");
        return IntStream.range(0, height)
                .mapToObj(idx -> LadderLevel.init(numOfMembers))
                .collect(Collectors.toList());
    }

}
