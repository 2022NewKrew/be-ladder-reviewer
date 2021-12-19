package com.kakao.nio.ladder.domain.impl;

import com.kakao.nio.ladder.domain.Ladder;
import com.kakao.nio.ladder.domain.LadderReader;

import java.util.List;

public class LadderImpl implements Ladder {

    private List<LadderLine> lines;

    public LadderImpl(List<LadderLine> lines) {
        this.lines = lines;
    }

    public LadderImpl(int numOfMembers, int height){
        this(LadderLineCreator.create(numOfMembers, height) );
    }

    @Override
    public LadderReader getReader() {
        return new DefaultLadderReader(lines);
    }

}
