package com.kakao.commerce.newkrew.game;

import com.kakao.commerce.newkrew.ladder.Ladder;

public class LadderGame {

    private final int player;
    private final Ladder ladder;

    public LadderGame(int player, Ladder ladder) {
        this.player = player;
        this.ladder = ladder;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public String toLadderString() {
        return ladder.toLadderString();
    }

    public String toResultString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < player; i++) {
            sb.append(i).append("->").append(ladder.getExit(i)).append('\n');
        }

        return sb.toString();
    }
}
