package com.kakao.study.ladder;

public class Controller {
    public Ladder generateLadder(int countOfPlayer, int heightOfLadder) {
        return Ladder.initialize(countOfPlayer, heightOfLadder);
    }
}
