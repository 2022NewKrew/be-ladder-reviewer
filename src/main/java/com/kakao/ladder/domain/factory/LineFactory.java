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
    private static final int MINIMUM_LADDER_HEIGHT = 1;
    private static final int MINIMUM_PARTICIPANT_NUMBER = 2;

    private final LineStrategy lineStrategy = new RandomLineStrategy();

    public List<Line> createLines(int numberOfParticipant, int heightOfLadder) {
        Preconditions.checkMinimumSize(numberOfParticipant, MINIMUM_PARTICIPANT_NUMBER,
                                       String.format("사람 수는 %s 이상 이어야 합니다.", MINIMUM_PARTICIPANT_NUMBER));
        Preconditions.checkMinimumSize(heightOfLadder, MINIMUM_LADDER_HEIGHT,
                                       String.format("사다리 높이는 %s 이상 이어야 합니다.", MINIMUM_LADDER_HEIGHT));

        return IntStream.rangeClosed(RANGE_START, heightOfLadder)
                .boxed()
                .map(h -> createLine(numberOfParticipant))
                .collect(Collectors.toList());
    }

    private Line createLine(Integer numberOfParticipant) {
        return Line.of(lineStrategy.createPoints(numberOfParticipant));
    }
}
