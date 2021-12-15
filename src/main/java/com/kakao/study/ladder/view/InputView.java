package com.kakao.study.ladder.view;

import java.util.Scanner;

public class InputView {

    private final static String INPUT_COUNT_OF_PLAYER_MESSAGE = "참여할 사람은 몇 명인가요?";
    private final static String INPUT_HEIGHT_OF_LADDER_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private final Scanner scanner = new Scanner(System.in);

    public int inputCountOfPlayer() {
        System.out.println(INPUT_COUNT_OF_PLAYER_MESSAGE);
        return scanner.nextInt();
    }

    public int inputHeightOfLadder() {
        System.out.println(INPUT_HEIGHT_OF_LADDER_MESSAGE);
        return scanner.nextInt();
    }
}
