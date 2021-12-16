package com.louis.ladder.game;

import com.louis.ladder.game.util.LadderUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderLine {

    private final List<LadderParts> ladderPartsList;

    private LadderLine(List<LadderParts> ladderPartsList) {
        this.ladderPartsList = ladderPartsList;
    }

    public static LadderLine createLadderLine(int totalPeople) {
        List<LadderParts> partsList = IntStream.range(0, LadderUtils.calculateLadderWidth(totalPeople))
                .mapToObj(LadderParts::of)
                .collect(Collectors.toList());

        LadderUtils.getHorizonIndexList(totalPeople)
                .forEach(it -> {
                    if (it != 1 && partsList.get(it - 2) == LadderParts.MOVE_PARTS) return;
                    partsList.set(it, LadderParts.randomParts());
                });

        return new LadderLine(partsList);
    }

    @Override
    public String toString() {
        return ladderPartsList.stream()
                .map(LadderParts::toString)
                .collect(Collectors.joining());
    }
}
