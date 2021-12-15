package com.kakao.commerce.newkrew.ladder;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderFloor {
    private final int width;
    private final List<Boolean> crossBars;
    private final List<Integer> results;

    public LadderFloor(Integer width, List<Boolean> crossBars) {
        Objects.requireNonNull(width);
        Objects.requireNonNull(crossBars);
        if (crossBars.size() != width - 1) {
            throw new IllegalArgumentException("잘못된 입력");
        }

        this.width = width;
        this.crossBars = crossBars;
        results = IntStream.range(0, width)
                           .map(this::enter)
                           .boxed()
                           .collect(Collectors.toUnmodifiableList());
    }

    public Integer getExit(int entrance) {
        return results.get(entrance);
    }

    public int getWidth() {
        return width;
    }

    public List<Boolean> getCrossBars() {
        return crossBars;
    }

    private Integer enter(int verticalIndex) {
        int leftCrossBar = verticalIndex - 1;
        int rightCrossBar = verticalIndex;

        if (hasCrossBar(leftCrossBar)) {
            return leftCrossBar;
        }

        if (hasCrossBar(rightCrossBar)) {
            return verticalIndex + 1;
        }

        return verticalIndex;
    }

    private Boolean hasCrossBar(int crossBarIndex) {
        if (crossBarIndex < 0 || crossBars.size() <= crossBarIndex) {
            return Boolean.FALSE;
        }

        return crossBars.get(crossBarIndex);
    }

    public String toFloorString(String verticalBar, String crossBar, String emptyCrossBar) {
        StringBuilder sb = new StringBuilder(verticalBar);

        sb.append(crossBars.stream().map(bar -> (bar ? crossBar : emptyCrossBar) + verticalBar)
                           .collect(Collectors.joining()));

        return sb.toString();
    }
}
