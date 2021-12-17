package com.kakao.domain;

import static com.kakao.util.Std.*;

public class Height {

    private final int value;

    public Height(int value) {
        require(value > 0, "높이는 0보다 커야합니다");

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
