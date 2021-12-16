package com.louis.ladder;

import com.louis.ladder.game.Ladder;
import com.louis.ladder.view.InputView;
import com.louis.ladder.view.LadderView;

public class LadderGame {

    public LadderGame() {
        InputView inputView = new InputView();
        int totalPeople = inputView.inputPeople();
        int ladderHeight = inputView.inputLadderHeight();

        Ladder ladder = Ladder.createLadder(totalPeople, ladderHeight);

        LadderView ladderView = new LadderView();
        ladderView.printLadder(ladder);
    }

    public static void main(String[] args) {
        new LadderGame();
    }

}
