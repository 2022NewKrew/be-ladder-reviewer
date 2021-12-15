package com.kakao.commerce.minialice.laddergame;

import com.kakao.commerce.minialice.laddergame.dto.LadderInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static LadderInput readLadderInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int peopleCount = sc.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = sc.nextInt();

        return new LadderInput(peopleCount, ladderHeight);
    }

    public static void printLadders(List<List<Boolean>> ladders) {
        for (List<Boolean> ladder : ladders) {
            System.out.print("|");
            for (Boolean leg : ladder) {
                if (leg) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static List<List<Boolean>> makeLadders(LadderInput ladderInputInfo) {
        List<List<Boolean>> ladders = new ArrayList<>();
        for (int i = 0; i < ladderInputInfo.getLadderHeight(); i++) {
            List<Boolean> legs = makeLegs(ladderInputInfo);
            ladders.add(legs);
        }

        return ladders;
    }

    public static List<Boolean> makeLegs(LadderInput ladderInputInfo) {
        Random random = new Random();
        List<Boolean> legs = new ArrayList<>();
        boolean prevLadderLeg = false;

        for (int i = 0; i < (ladderInputInfo.getPeopleCount() - 1); i++) {
            if (prevLadderLeg) {
                prevLadderLeg = false;
            } else {
                prevLadderLeg = random.nextBoolean();
            }
            legs.add(prevLadderLeg);
        }

        return legs;
    }

    public static void main(String[] args) {
        LadderInput ladderInput = readLadderInput();

        List<List<Boolean>> ladders = makeLadders(ladderInput);

        printLadders(ladders);
    }
}
