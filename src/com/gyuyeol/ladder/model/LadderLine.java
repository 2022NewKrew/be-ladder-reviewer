package com.gyuyeol.ladder.model;

public class LadderLine {
    private final boolean movable;

    public LadderLine(boolean movable) {
        this.movable = movable;
    }

    public boolean movable() {
        return movable;
    }
}
