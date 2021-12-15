package com.kakao.ladder.domain.factory;

import com.kakao.ladder.domain.Line;
import com.kakao.ladder.common.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineFactory {
    private static final Random RANDOM = new Random();
    private static final int START_POINT_INDEX = 1;
    private static final int PREVIOUS_POINT_INDEX = -1;

    private static final int RANGE_START = 1;
    private static final int MINIMUM_HEIGHT_SIZE = 1;
    private static final int MINIMUM_PERSON_SIZE = 2;

    public List<Line> createLines(int countOfPerson, int heightOfLadder) {
        Preconditions.checkMinimumSize(countOfPerson, MINIMUM_PERSON_SIZE,
                                       String.format("사람 수는 %s 이상 이어야 합니다.", MINIMUM_PERSON_SIZE));
        Preconditions.checkMinimumSize(heightOfLadder, MINIMUM_HEIGHT_SIZE,
                                       String.format("사다리 높이는 %s 이상 이어야 합니다.", MINIMUM_HEIGHT_SIZE));

        return IntStream.rangeClosed(RANGE_START, heightOfLadder)
                .boxed()
                .map(h -> Line.of(createPoints(countOfPerson)))
                .collect(Collectors.toList());
    }

    private List<Boolean> createPoints(int countOfPerson) {
        List<Boolean> points = new ArrayList<>(Collections.nCopies(countOfPerson, false));

        IntStream.range(START_POINT_INDEX, countOfPerson)
                .forEach(index -> {
                    boolean previousPoint = points.get(index + PREVIOUS_POINT_INDEX);
                    points.set(index, nextPoint(previousPoint));
                });
        return points;
    }

    private boolean nextPoint(boolean previousPoint) {
        if (previousPoint) {
            return false;
        }
        return RANDOM.nextBoolean();
    }
}
