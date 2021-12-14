package com.louis.ladder.game;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {

    private List<LadderLine> ladderLineList;

    private Ladder(List<LadderLine> ladderLineList) {
        this.ladderLineList = ladderLineList;
    }

    public static Ladder createLadder(int totalPeople, int ladderHeight) {
        List<LadderLine> lineList = IntStream.range(0, ladderHeight)
                .mapToObj(i -> LadderLine.createLadderParts(totalPeople))
                .collect(Collectors.toList());

        return new Ladder(lineList);
    }
}
