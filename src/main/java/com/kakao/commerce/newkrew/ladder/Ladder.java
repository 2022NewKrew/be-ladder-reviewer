package com.kakao.commerce.newkrew.ladder;

import java.util.Objects;

import com.kakao.commerce.newkrew.common.Floor;

public class Ladder {

    private final int width;
    private final String verticalBar;
    private final String crossBar;
    private final String emptyCrossBar;

    private int depth = 0;
    private Floor<LadderFloor> top;
    private Floor<LadderFloor> bottom;

    public Ladder(Integer width, String verticalBar, String crossBar, String emptyCrossBar) {
        Objects.requireNonNull(width);
        Objects.requireNonNull(verticalBar);
        Objects.requireNonNull(crossBar);
        Objects.requireNonNull(emptyCrossBar);

        this.width = width;
        this.verticalBar = verticalBar;
        this.crossBar = crossBar;
        this.emptyCrossBar = emptyCrossBar;
    }

    public void addBottom(LadderFloor ladderFloor) {
        if (ladderFloor.getWidth() != width) {
            throw new IllegalArgumentException("잘못된 입력");
        }

        final Floor<LadderFloor> b = bottom;
        final Floor<LadderFloor> newFloor = new Floor<>(b, ladderFloor, null);
        bottom = newFloor;
        if (b == null) {
            top = newFloor;
        } else {
            b.downFloor(newFloor);
        }

        depth++;
    }

    public int getDepth() {
        return depth;
    }

    public Integer getExit(int entrance) {
        int exit = entrance;

        Floor<LadderFloor> currentFloor = top;
        do {
            exit = currentFloor.getCurrent().getExit(exit);
            currentFloor = currentFloor.downFloor();
        } while (currentFloor != null);

        return exit;
    }

    public String toLadderString() {
        StringBuilder sb = new StringBuilder();

        Floor<LadderFloor> currentFloor = top;
        do {
            sb.append(currentFloor.getCurrent().toFloorString(verticalBar, crossBar, emptyCrossBar))
              .append('\n');
            currentFloor = currentFloor.downFloor();
        } while (currentFloor != null);

        return sb.toString();
    }
}
