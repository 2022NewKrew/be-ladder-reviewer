package com.kakao.ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final static Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static int inputUserCount(){
        System.out.println("참여할 사람은 몇 명인가요?");
        return scanner.nextInt();
    }

    public static int inputMaxHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return scanner.nextInt();
    }
}
