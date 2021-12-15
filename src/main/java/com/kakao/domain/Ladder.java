package com.kakao.domain;

public class Ladder {

    private final HeadCount headCount;
    private final Height height;
    private final LadderCrosses ladderCrosses;

    public Ladder(HeadCount headCount, Height height, LadderCrosses ladderCrosses) {
        validate(headCount, height, ladderCrosses);

        this.headCount = headCount;
        this.height = height;
        this.ladderCrosses = ladderCrosses;
    }

    private static void validate(HeadCount headCount, Height height, LadderCrosses ladderCrosses) {
        if (ladderCrosses.size() != height.getValue()) {
            throw new IllegalArgumentException();
        }
        if (isLadderCrossSizeBeyondHeadCount(headCount, ladderCrosses)) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isLadderCrossSizeBeyondHeadCount(HeadCount headCount, LadderCrosses ladderCrosses) {
        return ladderCrosses.getAllRight()
                            .stream()
                            .anyMatch(right -> right >= headCount.getValue());
    }

    public HeadCount getHeadCount() {
        return headCount;
    }

    public Height getHeight() {
        return height;
    }

    public LadderCrosses getLadderCrosses() {
        return ladderCrosses;
    }
}
