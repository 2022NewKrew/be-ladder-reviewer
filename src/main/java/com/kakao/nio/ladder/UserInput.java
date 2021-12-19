package com.kakao.nio.ladder;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readNumOfMembers() { return getNumberFromStdin("참여할 사람은 몇 명인가요?"); }

    public int readLadderHeight() {
        return getNumberFromStdin("최대 사다리 높이는 몇 개인가요?");
    }

    private String getStringFromStdin(String displayText) {
        System.out.println(displayText);
        return scanner.nextLine();
    }

    private int getNumberFromStdin(String displayText) {
        System.out.println(displayText);
        return Integer.valueOf(scanner.nextLine());
    }

}
