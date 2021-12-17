package com.kakaocorp.ladder.game;

import java.util.Random;
import java.util.Scanner;

public class LadderGame {
    private final Scanner scanner;
    private final Random random;

    private int numSteps;
    private int ladderHeight;

    private boolean[][] ladder;

    public LadderGame() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void runGame() {
        askPeople();
        askHeight();
        generateLadder();
        printLadder();
    }

    private void askPeople() {
        System.out.println("참여할 사람은 몇 명인가요?");
        // step(가로 라인)은 bar(세로 기둥) 사이에 들어가므로 사람 수보다 1 적다. ex: 사람이 3명이면 step은 2 개.
        numSteps = nextInt() - 1;
    }

    private void askHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        ladderHeight = nextInt();
    }

    private int nextInt() {
        return scanner.nextInt();
    }

    private void generateLadder() {
        ladder = new boolean[ladderHeight][];
        for (int i = 0; i < ladderHeight; ++i) {
            ladder[i] = generateSteps();
        }
    }

    private boolean[] generateSteps() {
        boolean[] steps = new boolean[numSteps];
        for (int i = 0; i < numSteps; ++i) {
            steps[i] = random.nextBoolean();
        }
        return steps;
    }

    private void printLadder() {
        for (int i = 0; i < ladderHeight; ++i) {
            printSteps(ladder[i]);
            System.out.println();
        }
    }

    private void printSteps(boolean[] steps) {
        System.out.print("|");
        for (int i = 0; i < numSteps; ++i) {
            System.out.print(steps[i] ? "-" : " ");
            System.out.print("|");
        }
    }
}
