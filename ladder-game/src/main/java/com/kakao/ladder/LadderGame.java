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
            sb.append(getLadderString(row));
        }

        System.out.print(sb);
    }

    private String getLadderString(int row) {
        StringBuilder sb = new StringBuilder();

        for (int col=0; col<userCount; col++) {
            sb.append(hasRightLink[row][col] ? connectedLadder : notConnectedLadder);
        }

        sb.append('\n');

        return sb.toString();
    }

    private boolean[][] makeLadderLink() {
        boolean[][] hasRightLink = new boolean[ladderHeight][userCount];

        for (int row=0; row<ladderHeight; row++) {
            hasRightLink[row] = makeRightLink();
        }

        return hasRightLink;
    }

    private boolean[] makeRightLink() {
        boolean[] hasRightLink = new boolean[userCount];

        for (int col=0; col<userCount-1; col++) {
            hasRightLink[col] = makeLinkRandomly(hasRightLink, col);
        }

        return hasRightLink;
    }

    private boolean makeLinkRandomly(boolean[] hasRightLink, int col) {
        return doseNotHaveLeftLink(hasRightLink, col) && successRandomly();
    }

    private boolean doseNotHaveLeftLink(boolean[] hasRightLink, int col) {
        return (col == 0 || !hasRightLink[col-1]);
    }

    private boolean successRandomly() {
        return Math.random() < 0.5;
    }
}
