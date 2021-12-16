package com.kakao.domain;

import java.util.Collections;
import java.util.List;

public class LadderRow {

    private final List<Boolean> crosses;

    public LadderRow(List<Boolean> crosses) {
        validateNoConsecutiveCross(crosses);

        this.crosses = Collections.unmodifiableList(crosses);
    }

    private static void validateNoConsecutiveCross(List<Boolean> crosses) {
        if (isConsecutiveTrueExist(crosses)) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isConsecutiveTrueExist(List<Boolean> l) {
        if (l.isEmpty() || l.size() == 1) {
            return false;
        }
        if (l.get(0) && l.get(1)) {
            return true;
        }
        return isConsecutiveTrueExist(l.subList(1, l.size()));
    }

    public int size() {
        return crosses.size();
    }

    public List<Boolean> getCrosses() {
        return crosses;
    }
}
