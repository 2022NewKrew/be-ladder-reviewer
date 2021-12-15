package com.kakao.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LadderCrosses {

    private final List<LadderCross> ladderCrosses;

    public LadderCrosses(List<LadderCross> ladderCrosses) {
        this.ladderCrosses = Collections.unmodifiableList(ladderCrosses);
    }

    public int size() {
        return ladderCrosses.size();
    }

    public List<Integer> getAllRight() {
        return ladderCrosses.stream()
                            .map(LadderCross::getRight)
                            .collect(Collectors.toList());
    }

    public List<Integer> getAllLeft() {
        return ladderCrosses.stream()
                            .map(LadderCross::getLeft)
                            .collect(Collectors.toList());
    }
}
