package com.kakao.commerce.newkrew.ladder;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomLadderFactory implements LadderFactory {

    private static final LadderFactory INSTANCE = new RandomLadderFactory();

    public static LadderFactory factory() {
        return INSTANCE;
    }

    @Override
    public Ladder make(LadderSpecification specification) {

        Ladder ladder = new Ladder(specification.getWidth(),
                                   specification.getVerticalBar(),
                                   specification.getCrossBar(),
                                   specification.getEmptyCrossBar());

        for (int i = 0; i < specification.getDepth(); i++) {
            LadderFloor ladderFloor = new LadderFloor(specification.getWidth(),
                                                      makeRandomCrossBars(specification.getWidth() - 1));

            ladder.addBottom(ladderFloor);
        }

        return ladder;
    }

    private static List<Boolean> makeRandomCrossBars(int size) {
        return IntStream.range(0, size)
                        .boxed()
                        .map(it -> ThreadLocalRandom.current().nextBoolean())
                        .collect(Collectors.toUnmodifiableList());
    }
}
