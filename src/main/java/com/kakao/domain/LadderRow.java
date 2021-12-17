package com.kakao.domain;

import static com.kakao.util.Std.*;

import java.util.Collections;
import java.util.List;

public class LadderRow {

    private final List<Boolean> crosses;

    public LadderRow(List<Boolean> crosses) {
        require(!isConsecutiveTrueExist(crosses), "연속으로 cross가 존재할 수 없습니다.");

        this.crosses = Collections.unmodifiableList(crosses);
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
