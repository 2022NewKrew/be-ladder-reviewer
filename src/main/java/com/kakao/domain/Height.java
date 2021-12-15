package com.kakao.domain;

public class Height {

    private final int value;

    public Height(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
