package com.kakao.nio.ladder.domain.impl;

import com.kakao.nio.ladder.domain.LadderItem;

import java.util.Arrays;
import java.util.List;

/**
 * 사다리 게임에서 길찾기를 할때 이동하는 단위입니다.
 * LadderLevel 에 포함된 Point 는 순번(index) 를 가지고 방향성(왼쪽, 오른쪽) 을 가집니다
 */
public class Point implements SupportedLadderItems {

    private final int index;
    private final Direction direction;

    public Point(int index, Direction direction) {
        this.index = index;
        this.direction = direction;
    }

    public int move() {
        if(direction.isLeft()) return index - 1;
        if(direction.isRight()) return index + 1;
        return index;
    }

    public Point next() {
        return new Point(index+1, direction.next());
    }

    public Point next(Boolean right) {
        return new Point(index+1, direction.next(right));
    }

    public Point last() {
        return new Point(index+1, direction.last());
    }

    public static Point first(Boolean right) {
        return new Point(0, Direction.first(right));
    }

    @Override
    public String toString() {
        return "Point{" +
                "index=" + index +
                ", direction=" + direction +
                '}';
    }

    @Override
    public List<LadderItem> toLadderItems() {
        if(direction.isRight())
            return Arrays.asList(LadderItem.Bar, LadderItem.Step);
        return Arrays.asList(LadderItem.Bar, LadderItem.Empty);
    }
}
