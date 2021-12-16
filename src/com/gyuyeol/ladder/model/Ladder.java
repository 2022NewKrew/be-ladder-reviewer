package com.gyuyeol.ladder.model;

public class Ladder {
    private final LadderLines ladderLines;

    public Ladder(int ladderLineCount, RandomLadderLineGenerator randomLadderLineGenerator) {
        ladderLines = new LadderLines(ladderLineCount, randomLadderLineGenerator);
    }

    public LadderLines getLadderLines() {
        return ladderLines;
    }
}
