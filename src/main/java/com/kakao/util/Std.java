package com.kakao.util;

public final class Std {

    private Std() {}

    public static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }
}
