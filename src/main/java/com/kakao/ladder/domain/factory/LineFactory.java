package com.kakao.ladder.domain.factory;

import com.kakao.ladder.common.Preconditions;
import com.kakao.ladder.domain.Line;
import com.kakao.ladder.domain.strategy.LineStrategy;
import com.kakao.ladder.domain.strategy.RandomLineStrategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineFactory {
    private static final int RANGE_START = 1;
    private static final int MINIMUM_HEIGHT_SIZE = 1;
    private static final int MINIMUM_PERSON_SIZE = 2;

    private final LineStrategy lineStrategy = new RandomLineStrategy();

    public List<Line> createLines(int countOfPerson, int heightOfLadder) {
        Preconditions.checkMinimumSize(countOfPerson, MINIMUM_PERSON_SIZE,
                                       String.format("사람 수는 %s 이상 이어야 합니다.", MINIMUM_PERSON_SIZE));
        Preconditions.checkMinimumSize(heightOfLadder, MINIMUM_HEIGHT_SIZE,
                                       String.format("사다리 높이는 %s 이상 이어야 합니다.", MINIMUM_HEIGHT_SIZE));

        return IntStream.rangeClosed(RANGE_START, heightOfLadder)
                .boxed()
                .map(h -> createLine(countOfPerson))
                .collect(Collectors.toList());
    }

    private Line createLine(Integer countOfPerson) {
        return Line.of(lineStrategy.createPoints(countOfPerson));
    }
}
