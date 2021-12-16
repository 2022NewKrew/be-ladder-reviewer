package com.kakao.reviewer;

public class LadderGame {
    public static void main(String[] args) {
        int memberSize = InputView.scanMemberSize();
        int height = InputView.scanHeight();
        Ladder ladder = new Ladder(memberSize, height).build();
        ResultView.print(ladder);
    }
}
