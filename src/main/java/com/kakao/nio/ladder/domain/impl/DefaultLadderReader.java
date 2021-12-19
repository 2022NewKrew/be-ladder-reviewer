package com.kakao.nio.ladder.domain.impl;

import com.kakao.nio.ladder.domain.LadderItem;
import com.kakao.nio.ladder.domain.LadderReader;

import java.util.List;
import java.util.stream.Collectors;

/**
 * LadderReader 기본구현
 *
 * SupportedLadderItems 을 구현한 객체 List 를 생성자로 받는다
 */
public class DefaultLadderReader implements LadderReader {

    private final List<List<LadderItem>> lines;
    private int next = 0;

    public DefaultLadderReader(List<? extends SupportedLadderItems> lines) {
        this.lines = lines.stream().map(line -> line.toLadderItems()).collect(Collectors.toList());
    }

    private boolean isEOL() {
        return next >= lines.size();
    }

    @Override
    public List<LadderItem> readLine() {
        if (isEOL()) return null;
        return lines.get(next++);
    }

}
