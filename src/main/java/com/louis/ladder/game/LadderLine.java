package com.louis.ladder.game;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderLine {

    private final List<LadderParts> ladderPartsList;

    private LadderLine(List<LadderParts> ladderPartsList) {
        this.ladderPartsList = ladderPartsList;
    }

    public static LadderLine createLadderParts(int ladderWidth) {
        List<LadderParts> partsList = IntStream.range(0, ladderWidth * 2 - 1)
                .mapToObj(LadderParts::of)
                .collect(Collectors.toList());

        return new LadderLine(partsList);
    }

    @Override
    public String toString() {
        return ladderPartsList.stream()
                .map(LadderParts::toString)
                .collect(Collectors.joining());
    }
}
