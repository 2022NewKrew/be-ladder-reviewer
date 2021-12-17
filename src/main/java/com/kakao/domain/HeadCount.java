package com.kakao.domain;

import static com.kakao.util.Std.*;

public class HeadCount {

    private final int value;

    public HeadCount(int value) {
        require(value >= 2, "인원수는 둘 이상이어야 합니다.");

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
