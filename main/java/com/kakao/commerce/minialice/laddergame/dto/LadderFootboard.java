package com.kakao.commerce.minialice.laddergame.dto;

public class LadderFootboard {
    private final boolean use;

    public LadderFootboard(boolean use) {
        this.use = use;
    }

    public static LadderFootboard from(boolean use) {
        return new LadderFootboard(use);
    }

    public boolean isUse() {
        return use;
    }
}
