package com.gyuyeol.ladder;

import com.gyuyeol.ladder.controller.LadderGame;
import com.gyuyeol.ladder.ui.LadderGameUI;

public class App {
    public static void main(String[] args) {
        LadderGameUI ladderGameUI = new LadderGameUI();
        new LadderGame(ladderGameUI).start();
    }
}
