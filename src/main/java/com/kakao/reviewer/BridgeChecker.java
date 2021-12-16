package com.kakao.reviewer;

import java.util.Random;

public class BridgeChecker {
    private final Random random;

    public BridgeChecker() {
        this.random = new Random();
    }

    public boolean isBuild() {
        return random.nextBoolean();
    }
}
