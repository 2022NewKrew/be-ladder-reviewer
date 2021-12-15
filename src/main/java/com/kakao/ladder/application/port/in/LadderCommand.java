package com.kakao.ladder.application.port.in;

public class LadderCommand {
    private final int numberOfParticipant;
    private final int heightOfLadder;

    private LadderCommand(int numberOfParticipant, int heightOfLadder) {
        this.numberOfParticipant = numberOfParticipant;
        this.heightOfLadder = heightOfLadder;
    }

    public static LadderCommand of(int numberOfParticipant, int heightOfLadder) {
        return new LadderCommand(numberOfParticipant, heightOfLadder);
    }

    public int getNumberOfParticipant() {
        return numberOfParticipant;
    }

    public int getHeightOfLadder() {
        return heightOfLadder;
    }
}
