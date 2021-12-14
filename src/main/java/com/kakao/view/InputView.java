package com.kakao.view;

import java.util.Scanner;

public final class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static int getHeadCount() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return getInt();
    }

    public static int getHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return getInt();
    }

    private static int getInt() {
        return scanner.nextInt();
    }
}
