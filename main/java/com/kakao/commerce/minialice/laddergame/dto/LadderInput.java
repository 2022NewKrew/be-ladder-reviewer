package com.kakao.commerce.minialice.laddergame.dto;

public class LadderInput {
    private final int peopleCount;
    private final int ladderHeight;

    public LadderInput(int peopleCount, int ladderHeight) {
        this.peopleCount = peopleCount;
        this.ladderHeight = ladderHeight;
    }

    public int getFootboardAreaCount() {
        return peopleCount - 1;
    }

    public int getLadderHeight() {
        return ladderHeight;
    }
}
