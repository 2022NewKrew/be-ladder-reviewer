package com.gyuyeol.ladder.model;

public class Ladder {
    private final LadderLines ladderLines;

    public Ladder(int ladderLineCount, LadderLineGenerator ladderLineGenerator) {
        ladderLines = new LadderLines(ladderLineCount, ladderLineGenerator);
    }

    public LadderLines getLadderLines() {
        return ladderLines;
    }
}
