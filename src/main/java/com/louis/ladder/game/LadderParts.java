package com.louis.ladder.game;

public enum LadderParts {
    VERTEX("|"),
    MOVE_PARTS("-"),
    BLINK(" ");

    private final String parts;

    LadderParts(String parts) {
        this.parts = parts;
    }

    public static LadderParts of(int partsIndex) {
        if (partsIndex % 2 == 0) return VERTEX;
        return BLINK;
    }

    @Override
    public String toString() {
        return this.parts;
    }
}
