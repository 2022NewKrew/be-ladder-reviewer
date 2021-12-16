package com.kakao.commerce;

import java.util.Scanner;

import com.kakao.commerce.domain.Ladder;
import com.kakao.commerce.maker.LadderMaker;

public class LadderGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int peopleCount = sc.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = sc.nextInt();

        LadderMaker ladderMaker = new LadderMaker();
        Ladder ladder = ladderMaker.makeLadder(peopleCount, height);
        ladder.draw();
    }
}
