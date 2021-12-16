package com.gyuyeol.ladder;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LadderGame {
    public static void main(String[] args) {
        int playerCount = getPlayerCount();
        int ladderHeight = getLadderHeight();

        List<Boolean> ladderLines = getRandomLadderLines(playerCount, ladderHeight);
        drawLadder(playerCount, ladderHeight, ladderLines);
    }

    private static void drawLadder(int playerCount, int ladderHeight, List<Boolean> ladderLines) {
        for (int rowIndex = 0; rowIndex < ladderHeight; rowIndex++) {

            System.out.print("|");
            for (int columnIndex = 0; columnIndex < (playerCount - 1); columnIndex++) {
                System.out.print(ladderLines.get((rowIndex * (playerCount - 1)) + columnIndex) ? "-" : " ");
                System.out.print("|");
            }
            System.out.println();
        }
    }

    private static int getPlayerCount() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return getNumber();
    }

    private static int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return getNumber();
    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static List<Boolean> getRandomLadderLines(int playerCount, int ladderHeight) {
        return new Random().ints((playerCount - 1) * ladderHeight)
                .map(Math::abs)
                .mapToObj(i -> (i % 2) == 1)
                .collect(Collectors.toList());
    }
}
