package com.gyuyeol.ladder.model;

import java.util.Random;
import java.util.stream.Stream;

public class RandomLadderLineGenerator implements LadderLineGenerator {
    private static final Random random = new Random();

    @Override
    public Stream<Boolean> movableStream(int count) {
        return random.ints(count)
                .map(Math::abs)
                .mapToObj(value -> value % 2 == 0);
    }
}
