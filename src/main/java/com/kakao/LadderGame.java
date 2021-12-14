package com.kakao;

import java.util.Random;
import java.util.Scanner;

public class LadderGame {
    private int participantCount;
    private int maxLadderHeight;

    public void readInput() {
        var scanner = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        var inputParticipantCount = scanner.next();
        this.participantCount = Integer.parseInt(inputParticipantCount);

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        var inputMaxLadderHeight = scanner.next();
        this.maxLadderHeight = Integer.parseInt(inputMaxLadderHeight);
    }

    public void print() {
        var ladder = new String[maxLadderHeight][participantCount];

        for (int heightIndex = 0; heightIndex < ladder.length; heightIndex++) {
            // Random.nextInt는 0부터 시작, -2를 하여 사다리가 들어갈 위치를 랜덤으로 구한다
            var randomNumber = new Random().nextInt(participantCount - 2);
            // 사람 수 만큼 선을 배치한다
            for (int participantIndex = 0; participantIndex < ladder[heightIndex].length; participantIndex++) {
                System.out.print("|");
                // 랜덤 번호에 해당할 경우 사다리를 놓는다(사다리를 넣을 사이 공간)
                if (participantIndex == randomNumber + 1) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void start() {
        readInput();
        print();
    }

    public static void main(String[] args) {
        var ladderGame = new LadderGame();

        ladderGame.start();
    }
}
