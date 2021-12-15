package com.kakao.ladder.ui;

import com.kakao.ladder.model.Ladder;

public class LadderGameView {
    private final LadderScanner in;
    private final LadderPrinter out;

    public LadderGameView() {
        this(LadderScanner.system(), LadderPrinter.system());
    }

    public LadderGameView(LadderScanner in, LadderPrinter out) {
        this.in = in;
        this.out = out;
    }

    /*
     * read
     */
    public int inputPlayers() {
        try {
            out.printMessage("참여할 사람은 몇 명인가요?");
            return in.readPlayerCount();
        } catch (Exception ex) {
            out.printError(ex.getMessage());
            return inputHeight();
        }
    }

    public int inputHeight() {
        try {
            out.printMessage("최대 사다리 높이는 몇 개인가요?");
            return in.readHeight();
        } catch (Exception ex) {
            out.printError(ex.getMessage());
            return inputHeight();
        }
    }

    /*
     * write
     */
    public void printLadder(Ladder ladder) {
        out.printMessage("");
        out.printLadder(ladder);
    }
}
