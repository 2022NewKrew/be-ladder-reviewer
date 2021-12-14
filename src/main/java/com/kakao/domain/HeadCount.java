package com.kakao.domain;

public class HeadCount {

    private final int value;

    public HeadCount(int value) {
        if (value < 2) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
