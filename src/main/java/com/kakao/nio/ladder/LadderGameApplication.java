package com.kakao.nio.ladder;

import com.kakao.nio.ladder.domain.LadderGame;

import java.io.PrintWriter;

public class LadderGameApplication {

    public static void main(String[] args) {

        UserInput input = new UserInput();
        int numOfMembers = input.readNumOfMembers();
        int ladderHeight = input.readLadderHeight();

        LadderGame game = new LadderGame(numOfMembers, ladderHeight);
        game.printLadder(new PrintWriter(System.out));
    }
}
