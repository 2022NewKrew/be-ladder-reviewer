package com.kakao.commerce.newkrew.game;

import com.kakao.commerce.newkrew.ladder.Ladder;

public class LadderGame {

    private final Ladder ladder;

    public LadderGame(Ladder ladder) {
        this.ladder = ladder;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public String toLadderString() {
        return ladder.toLadderString();
    }
}
