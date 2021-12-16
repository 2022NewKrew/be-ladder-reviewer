package com.gyuyeol.ladder.model;

import java.util.List;
import java.util.stream.Collectors;

public class LadderLines {
    private final List<LadderLine> ladderLines;

    public LadderLines(int ladderLineCount, LadderLineGenerator ladderLineGenerator) {
        this.ladderLines = ladderLineGenerator.movableStream(ladderLineCount)
                .map(LadderLine::new)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<LadderLine> getLadderLines() {
        return ladderLines;
    }
}
