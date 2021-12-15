package com.kakao;

import java.util.Arrays;
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

    public String[][] createLadderFrame() {
        var ladder = new String[maxLadderHeight][participantCount];
        for (int heightIndex = 0; heightIndex < ladder.length; heightIndex++) {
            Arrays.fill(ladder[heightIndex], "|");
        }
        return ladder;
    }

    public void print() {
        var ladderFrame = createLadderFrame();
        var random = new Random();
        for (int heightIndex = 0; heightIndex < ladderFrame.length; heightIndex++) {
            // Random.nextInt는 0부터 시작(가장 높은 수가 나오면 사다리 생략)
            var randomNumber = random.nextInt(participantCount);
            // 사다리 놓기
            for (int participantIndex = 0; participantIndex < ladderFrame[participantIndex].length; participantIndex++) {
                System.out.print(ladderFrame[heightIndex][participantIndex]);

                // 랜덤 번호에 해당할 경우 사다리를 놓는다(사다리를 넣을 사이 공간), 마지막 자리엔 사다리를 놓지 않는다
                if (participantIndex == randomNumber && participantIndex + 1 != ladderFrame[participantIndex].length) {
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
        createLadderFrame();
        print();
    }

    public static void main(String[] args) {
        var ladderGame = new LadderGame();

        ladderGame.start();
    }
}
