package com.kakao.reviewer.domain;

public class Ladder {
    private int[][] bridges;
    private BridgeChecker bridgeChecker;

    public Ladder(int width, int height) {
        this.bridges = new int[height][width-1];
        this.bridgeChecker = new BridgeChecker();
    }

    public Ladder build() {
        for (int i = 0; i < bridges.length; i++) {
            for (int j = 0; j < bridges[i].length; j++) {
                if (bridgeChecker.isBuild()) {
                    bridges[i][j] = 1;
                } else {
                    bridges[i][j] = 0;
                }
            }
        }
        return this;
    }

    public int[][] getBridges() {
        return bridges;
    }
}
