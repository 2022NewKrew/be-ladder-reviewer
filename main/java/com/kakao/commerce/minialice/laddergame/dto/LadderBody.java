package com.kakao.commerce.minialice.laddergame.dto;

import java.util.List;

public class LadderBody {
    private final List<LadderFootboard> ladderFootboards;

    private LadderBody(List<LadderFootboard> ladderFootboards) {
        this.ladderFootboards = ladderFootboards;
    }

    public static LadderBody from(List<LadderFootboard> ladderFootboards) {
        return new LadderBody(ladderFootboards);
    }

    public List<LadderFootboard> getLadderFootboards() {
        return ladderFootboards;
    }
}
