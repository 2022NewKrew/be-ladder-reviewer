package com.kakao.reviewer.view;

import java.util.Scanner;

public class InputView {
    private static final String MEMBER_QUESTION_MESSAGE = "참여할 사람은 몇 명인가요?";
    private static final String HEIGHT_QUESTION_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    private static Scanner getUserInput() {
        return new Scanner(System.in);
    }

    public static int scanMemberSize() {
        System.out.println(MEMBER_QUESTION_MESSAGE);
        return getUserInput().nextInt();
    }

    public static int scanHeight() {
        System.out.println(HEIGHT_QUESTION_MESSAGE);
        return getUserInput().nextInt();
    }
}
