package com.louis.ladder.game.util;

public class LadderUtils {

    private LadderUtils() {
    }

    public static int calculateLadderWidth(int totalPeople) {
        return totalPeople * 2 - 1;
    }
}
