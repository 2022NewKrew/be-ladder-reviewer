package com.kakao.domain;

public class LadderCross {

    private final int left;
    private final int right;

    public static LadderCross of(int left) {
        return new LadderCross(left, left + 1);
    }

    public LadderCross(int left, int right) {
        validate(left, right);

        this.left = left;
        this.right = right;
    }

    private static void validate(int left, int right) {
        if (left < 0 || right < 0) {
            throw new IllegalArgumentException();
        }
        if (right - left != 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
