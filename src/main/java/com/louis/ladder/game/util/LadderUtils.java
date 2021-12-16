package com.louis.ladder.game.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderUtils {

    private LadderUtils() {
    }

    public static int calculateLadderWidth(int totalPeople) {
        return totalPeople * 2 - 1;
    }

    public static List<Integer> getHorizonIndexList(int totalPeople) {
        return IntStream.range(0, LadderUtils.calculateLadderWidth(totalPeople))
                .filter(i -> i % 2 == 1)
                .boxed().collect(Collectors.toList());
    }
}
