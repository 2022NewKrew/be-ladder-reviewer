package com.kakao.commerce.minialice.laddergame.dto;

import java.util.List;

public class Ladder {
    private final List<LadderBody> ladderBodies;

    private Ladder(List<LadderBody> ladderBodies) {
        this.ladderBodies = ladderBodies;
    }

    public static Ladder from(List<LadderBody> ladderBodies) {
        return new Ladder(ladderBodies);
    }

    public List<LadderBody> getLadderBodies() {
        return ladderBodies;
    }
}
