package com.kakao.reviewer;

public class ResultView {
    private static final String BRIDGE_MARK = "-";
    private static final String ROD_MARK = "|";

    public static void print(Ladder ladder) {
        int[][] bridges = ladder.getBridges();
        for (int[] bridge : bridges) {
            System.out.print(ROD_MARK);
            for (int i : bridge) {
                if (i == 1) {
                    System.out.print(BRIDGE_MARK);
                } else {
                    System.out.print(" ");
                }
                System.out.print(ROD_MARK);
            }
            System.out.println();
        }
    }
}
