package com.kakao.talkmsg.cooper;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int numOfPeople = scanner.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = scanner.nextInt();

        Ladder ladder = new Ladder(numOfPeople, height);
        Output.printLadder(ladder);
    }
}
