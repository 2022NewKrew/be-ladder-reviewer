package com.kakao.commerce;

import java.util.Scanner;

import com.kakao.commerce.domain.Ladder;
import com.kakao.commerce.maker.LadderMaker;

public class LadderGame {

    private static final String PEOPLE_COUNT_QUESTION = "참여할 사람은 몇 명인가요?";
    private static final String LADDER_HEIGHT_QUESTION = "최대 사다리 높이는 몇 개인가요?";

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println(PEOPLE_COUNT_QUESTION);
        int peopleCount = sc.nextInt();
        System.out.println(LADDER_HEIGHT_QUESTION);
        int height = sc.nextInt();

        LadderMaker ladderMaker = new LadderMaker();
        Ladder ladder = ladderMaker.makeLadder(peopleCount, height);
        ladder.draw();
    }
}
