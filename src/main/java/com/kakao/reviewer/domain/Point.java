package com.kakao.reviewer.domain;

public class Point {
    private final Boolean isBridge;

    public Point() {
        this.isBridge = new BridgeBuilder().isBuild();
    }

    public Boolean isBridge() {
        return isBridge;
    }
}
