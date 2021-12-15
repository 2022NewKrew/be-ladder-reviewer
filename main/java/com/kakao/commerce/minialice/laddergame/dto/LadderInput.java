package com.kakao.commerce.minialice.laddergame.dto;

public class LadderInput {
    private final int peopleCount;
    private final int ladderHeight;

    public LadderInput(int peopleCount, int ladderHeight) {
        this.peopleCount = peopleCount;
        this.ladderHeight = ladderHeight;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getLadderHeight() {
        return ladderHeight;
    }
}
