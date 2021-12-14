package com.louis.ladder.game;

import java.util.List;

public class LadderLine {

    private List<LadderParts> ladderPartsList;

    private LadderLine() {

    }

    public static LadderLine createLadderParts(int ladderWidth) {
        return new LadderLine();
    }
}
