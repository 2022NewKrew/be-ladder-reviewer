package com.kakao.domain;

import java.util.Random;

public final class RandomGenerator {

    private static final Random random = new Random();

    private RandomGenerator() {}

    public static int create(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
