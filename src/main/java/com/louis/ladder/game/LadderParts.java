package com.louis.ladder.game;

import java.util.Random;

public enum LadderParts {
    VERTEX("|"),
    MOVE_PARTS("-"),
    BLINK(" ");

    private static final Random random = new Random();
    private final String parts;

    LadderParts(String parts) {
        this.parts = parts;
    }

    public static LadderParts of(int partsIndex) {
        if (partsIndex % 2 == 0) return VERTEX;
        return BLINK;
    }

    public static LadderParts randomParts() {
        int randomValue = random.nextInt(10);
        if (randomValue >= 5) return BLINK;
        return MOVE_PARTS;
    }

    @Override
    public String toString() {
        return this.parts;
    }
}
