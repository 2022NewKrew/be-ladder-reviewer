package com.kakao.jayden.ladder;

import java.util.Random;
import java.util.Scanner;

public class Ladder {

    private final int width;
    private final int height;
    private final Random random = new Random();

    public Ladder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void print() {
        for (int i = 0 ; i < height ; i++) {
            printRow();
            System.out.println();
        }
    }

    private void printRow() {
        int rand = random.nextInt(width + 1);
        for (int i = 1 ; i <= width ; i ++) {
            System.out.print("|");

            if (i != rand || i == width) {
                System.out.print(" ");
            } else {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int peopleSize = scanner.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = scanner.nextInt();

        Ladder ladder = new Ladder(peopleSize, ladderHeight);
        ladder.print();
    }
}
