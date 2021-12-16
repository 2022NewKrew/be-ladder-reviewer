package com.kakao.ladder;

public class LadderGame {
    private final int userCount;
    private final int ladderHeight;
    private final boolean[][] hasRightLink;

    private static final String connectedLadder = "|-";
    private static final String notConnectedLadder = "| ";

    public LadderGame(int userCount, int ladderHeight) {
        this.userCount = userCount;
        this.ladderHeight = ladderHeight;
        this.hasRightLink = makeLadderLink();
    }

    public void printLadder() {
        StringBuilder sb = new StringBuilder();

        for (int row=0; row<ladderHeight; row++) {
            for (int col=0; col<userCount; col++) {
                sb.append(hasRightLink[row][col] ? connectedLadder : notConnectedLadder);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

    private boolean[][] makeLadderLink() {
        boolean[][] hasRightLink = new boolean[ladderHeight][userCount];

        for (int row=0; row<ladderHeight; row++) {
            for (int col=0; col<userCount-1; col++) {
                if (doseNotHaveLeftLink(hasRightLink, row, col) && successRandomly()) {
                    hasRightLink[row][col] = true;
                }
            }
        }

        return hasRightLink;
    }

    private boolean doseNotHaveLeftLink(boolean[][] hasRightLink, int row, int col) {
        return (col == 0 || !hasRightLink[row][col-1]);
    }

    private boolean successRandomly() {
        return Math.random() < 0.5;
    }
}
