package com.gyuyeol.ladder.controller;

import com.gyuyeol.ladder.model.Ladder;
import com.gyuyeol.ladder.model.RandomLadderLineGenerator;
import com.gyuyeol.ladder.ui.LadderGameUI;

public class LadderGame {
    private final LadderGameUI ladderGameUI;

    public LadderGame(LadderGameUI ladderGameUI) {
        this.ladderGameUI = ladderGameUI;
    }

    public void start() {
        int playerCount = ladderGameUI.getPlayerCount();
        int ladderHeight = ladderGameUI.getLadderHeight();
        int ladderLineCount = (playerCount - 1) * ladderHeight;

        Ladder ladder = new Ladder(ladderLineCount, new RandomLadderLineGenerator());

        ladderGameUI.drawResult(playerCount, ladderHeight, ladder.getLadderLines());
    }
}
