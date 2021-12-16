package com.kakao.domain;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ladder {

    private final List<LadderRow> ladder;

    public Ladder(List<LadderRow> ladder) {
        validate(ladder);

        this.ladder = Collections.unmodifiableList(ladder);
    }

    private static void validate(List<LadderRow> ladder) {
        if (!isAllRowSizeSame(ladder)) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isAllRowSizeSame(List<LadderRow> ladder) {
        Set<Integer> distinctRowSizes = ladder.stream()
                                     .map(LadderRow::size)
                                     .collect(Collectors.toSet());
        return distinctRowSizes.size() == 1;
    }

//    private static void validate(HeadCount headCount, Height height, List<LadderRow> ladder) {
//        if (ladder.size() != height.getValue()) {
//            throw new IllegalArgumentException();
//        }
//        if (isRowSizeInvalid(headCount, ladder)) {
//            throw new IllegalArgumentException();
//        }
//    }
//
//    private static boolean isRowSizeInvalid(HeadCount headCount, List<LadderRow> ladder) {
//        int validRowSize = headCount.getValue() - 1;
//        return ladder.stream()
//                     .noneMatch(row -> row.size() == validRowSize);
//    }

    public List<LadderRow> getLadder() {
        return ladder;
    }
}
