package com.kakao.reviewer.domain;

import java.util.Random;

public class BridgeBuilder {
    private final Random random;

    public BridgeBuilder() {
        this.random = new Random();
    }

    public boolean isBuild() {
        return random.nextBoolean();
    }
}
