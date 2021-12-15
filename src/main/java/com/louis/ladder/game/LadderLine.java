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

        partsList.set(LadderUtils.getRandomHorizonIndex(totalPeople), LadderParts.MOVE_PARTS);

        return new LadderLine(partsList);
    }

    @Override
    public String toString() {
        return ladderPartsList.stream()
                .map(LadderParts::toString)
                .collect(Collectors.joining());
    }
}
