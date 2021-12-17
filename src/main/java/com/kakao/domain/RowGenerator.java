package com.kakao.domain;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class RowGenerator {

    private static final Random random = new Random();

    private RowGenerator() {}

    public static List<Boolean> generate(int size) {
        return Stream.iterate(false, RowGenerator::nextOne)
                       .skip(1)
                       .limit(size)
                       .collect(Collectors.toList());
    }

    private static boolean nextOne(boolean prev) {
        if (prev) {
            return false;
        }
        return random.nextBoolean();
    }
}
