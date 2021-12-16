package com.kakao.commerce.minialice.laddergame.util;

import com.kakao.commerce.minialice.laddergame.dto.LadderInput;

import java.util.Scanner;

public class LadderInputReader {
    private static final Scanner sc = new Scanner(System.in);

    public static LadderInput read() {
        System.out.println("참여할 사람은 몇 명인가요?");
        int peopleCount = sc.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = sc.nextInt();

        return new LadderInput(peopleCount, ladderHeight);
    }
}
