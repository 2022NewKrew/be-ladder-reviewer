package com.kakao.view.dto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.kakao.domain.Ladder;
import com.kakao.domain.LadderRow;

public class LadderDto {

    private final List<List<Boolean>> isCross;

    public static LadderDto of(Ladder ladder) {
        List<List<Boolean>> isCross = ladder.getLadder()
              .stream()
              .map(LadderRow::getCrosses)
              .collect(Collectors.toList());
        return new LadderDto(isCross);
    }

    public LadderDto(List<List<Boolean>> isCross) {
        this.isCross = Collections.unmodifiableList(isCross);
    }

    public List<List<Boolean>> getIsCross() {
        return isCross;
    }
}
