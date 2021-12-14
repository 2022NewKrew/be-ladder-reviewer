package com.kakao.view.dto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.kakao.domain.Ladder;

public class LadderDto {

    private final int headCount;
    private final int height;
    private final List<Integer> ladderIndex;

    public static LadderDto of(Ladder ladder) {
        List<Integer> ladderIndexes = getLadderIndexes(ladder);
        return new LadderDto(ladder.getHeadCount().getValue(), ladder.getHeight().getValue(), ladderIndexes);
    }

    private static List<Integer> getLadderIndexes(Ladder ladder) {
        return ladder.getLadderCrosses()
                     .getAllLeft();
    }

    public LadderDto(int headCount, int height, List<Integer> ladderIndex) {
        this.headCount = headCount;
        this.height = height;
        this.ladderIndex = Collections.unmodifiableList(ladderIndex);
    }

    public int getHeadCount() {
        return headCount;
    }

    public int getHeight() {
        return height;
    }

    public List<Integer> getLadderIndex() {
        return ladderIndex;
    }
}
