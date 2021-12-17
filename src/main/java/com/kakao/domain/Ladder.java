package com.kakao.domain;

import static com.kakao.util.Std.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ladder {

    private final List<LadderRow> ladder;

    public Ladder(List<LadderRow> ladder) {
        require(isAllRowSizeSame(ladder), "각 row의 크기가 모두 같아야합니다.");

        this.ladder = Collections.unmodifiableList(ladder);
    }

    private static boolean isAllRowSizeSame(List<LadderRow> ladder) {
        Set<Integer> distinctRowSizes = ladder.stream()
                                              .map(LadderRow::size)
                                              .collect(Collectors.toSet());
        return distinctRowSizes.size() == 1;
    }

    public List<LadderRow> getLadder() {
        return ladder;
    }
}
