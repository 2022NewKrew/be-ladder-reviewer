package com.kakao.nio.ladder.domain.impl;


import com.kakao.nio.ladder.domain.LadderItem;
import com.kakao.nio.ladder.domain.SupportedLadderItems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LadderLine implements SupportedLadderItems {

    private List<Point> points;

    public LadderLine(List<Point> points) {
        this.points = points;
    }

    public static LadderLine init(int numOfMembers) {
        List<Point> points = new ArrayList<>();
        Point first = initFirst(points);
        Point current = initBody(numOfMembers, points, first);
        initLast(points, current);
        return new LadderLine(points);
    }

    private static Point initBody(int numOfMembers, List<Point> points, Point first) {
        Point current = first;
        for (int i = 1; i < numOfMembers - 1; i++) {
            Point next = current.next();
            points.add(next);
            current = next;
        }
        return current;
    }

    private static void initLast(List<Point> points, Point current) {
        points.add(current.last());
    }

    private static Point initFirst(List<Point> points) {
        Point first = Point.first(DirectionGenerator.generate());
        points.add(first);
        return first;
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

    public Builder last() {
        points.add(current.last());
        return this;
    }

    public LadderLine build() {
        return new LadderLine(points);
    }

}
