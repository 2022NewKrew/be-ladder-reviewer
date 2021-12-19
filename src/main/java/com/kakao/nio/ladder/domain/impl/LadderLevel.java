package com.kakao.nio.ladder.domain.impl;


import com.kakao.nio.ladder.domain.LadderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 사다리 한 층을 구성합니다
 *
 * n 개의 point 가 LadderLevel 을 구성합니다.
 * n 은 사다리게임에 참여하는 멤버수 입니다.
 */
public class LadderLevel implements SupportedLadderItems {

    private List<Point> points;

    public LadderLevel(List<Point> points) {
        this.points = points;
    }

    public static LadderLevel init(int numOfMembers) {
        Builder builder = LadderLevel.builder()
                .first(DirectionGenerator.generate());
        for(int i = 1; i < numOfMembers - 1; i++){
            builder.next();
        }
        builder.last();
        return builder.build();
    }

    @Override
    public String toString() {
        return "LadderLine{" +
                "points=" + points +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public List<LadderItem> toLadderItems() {
        List<LadderItem> items = points.stream()
                .flatMap(it -> it.toLadderItems().stream())
                .collect(Collectors.toList());
        items.remove(items.size()-1);
        return items;
    }
}

class Builder {

    private List<Point> points;
    private Point current;
    private int index;

    public Builder() {
        this.points = new ArrayList<>();
        this.index = 0;
    }

    public Builder first(boolean right) {
        current = new Point(index++, Direction.first(right));
        points.add(current);
        return this;
    }

    public Builder next(boolean right) {
        current = current.next(right);
        points.add(current);
        return this;
    }

    public Builder next(){
        current = current.next();
        points.add(current);
        return this;
    }

    public Builder last() {
        points.add(current.last());
        return this;
    }

    public LadderLevel build() {
        return new LadderLevel(points);
    }

}
