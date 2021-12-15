package com.kakao.june;

import java.util.Scanner;

public class LadderGame {
    private final Scanner scanner = new Scanner(System.in);
    private int userNumber;
    private int maxLadderHeight;
    private Ladder ladder;

    private void inputUserNumber() {
        System.out.println("참여할 사람은 몇 명인가요?");
        this.userNumber = Integer.parseInt(scanner.nextLine());
    }

    private void inputMaxLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        this.maxLadderHeight = Integer.parseInt(scanner.nextLine());
    }

    private void createLadder() {
        ladder = new Ladder(userNumber, maxLadderHeight);
    }

    private void printLadder() {
        ladder.printLadder();
    }

    public void run() {
        inputUserNumber();
        inputMaxLadderHeight();
        createLadder();
        printLadder();
    }
}
