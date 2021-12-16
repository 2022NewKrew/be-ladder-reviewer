package com.kakao.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class RowGenerator {

    private static final Random random = new Random();

    private RowGenerator() {}

    public static List<Boolean> generate(int size) {
        List<Boolean> result = new ArrayList<>(size + 1);
        result.add(false);
        for (int i = 0; i < size; i++) {
            boolean prev = result.get(result.size() - 1);
            result.add(nextOne(prev));
        }
        return result.subList(1, result.size());
    }

    private static boolean nextOne(boolean prev) {
        if (prev) {
            return false;
        }
        return random.nextBoolean();
    }
}
