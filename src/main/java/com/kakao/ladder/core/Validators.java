package com.kakao.ladder.core;

public class Validators {
    public static void validate(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void validateHeight(int height) {
        validate(height > 0, "invalid height");
    }

    public static void validatePlayerCount(int count) {
        validate(count > 0, "invalid player count");
    }
}
