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

    private static boolean isConsecutiveTrueExist(List<Boolean> crosses) {
        for (int i = 1; i < crosses.size(); i++) {
            if (crosses.get(i - 1) && crosses.get(i)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return crosses.size();
    }

    public List<Boolean> getCrosses() {
        return crosses;
    }
}
