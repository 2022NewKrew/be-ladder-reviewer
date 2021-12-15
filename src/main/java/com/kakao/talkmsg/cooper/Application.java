package com.kakao.talkmsg.cooper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("참여할 사람은 몇 명인가요?");
            Integer numOfPeople = Integer.valueOf(bufferedReader.readLine());

            System.out.println("최대 사다리 높이는 몇 개인가요?");
            Integer height = Integer.valueOf(bufferedReader.readLine());

            Ladder ladder = new Ladder(numOfPeople, height);
            printLadder(ladder);
        }
    }

    private static void printLadder(Ladder ladder) {
        ladder.getPoints().stream()
                .forEach(row -> {
                    row.stream().map(edge -> edge ? "-" : " ").forEach(edge -> {
                        System.out.print("|");
                        System.out.print(edge);
                    });
                    System.out.println("|");
                });
    }
}
