package com.kakao.nio.ladder.domain.impl;

import com.kakao.nio.ladder.domain.Ladder;
import com.kakao.nio.ladder.domain.LadderReader;

import java.util.List;

/**
 * Ladder 기본구현
 *
 * LadderLevel n 개가 Ladder 를 구성합니다.
 * LadderLevel 은 m 개의 Point 로 구성됩니다.
 * Point 는 순번과 이동할 수 있는 방향성(왼쪽, 오른쪽)을 가집니다.
 */
public class LadderImpl implements Ladder {

    private List<LadderLevel> lines;

    public LadderImpl(List<LadderLevel> lines) {
        this.lines = lines;
    }

    public LadderImpl(int numOfMembers, int height){
        this(LadderLevelCreator.create(numOfMembers, height) );
    }

    @Override
    public LadderReader getReader() {
        return new DefaultLadderReader(lines);
    }

}
