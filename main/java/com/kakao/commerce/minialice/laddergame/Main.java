package com.kakao.commerce.minialice.laddergame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int peopleCount = sc.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = sc.nextInt();

        List<List<Boolean>> ladders = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < ladderHeight; i++) {
            List<Boolean> legs = new ArrayList<>();
            boolean prevLadderLeg = false;

            for (int j = 0; j < (peopleCount - 1); j++) {
                if (prevLadderLeg) {
                    prevLadderLeg = false;
                } else {
                    prevLadderLeg = random.nextBoolean();
                }
                legs.add(prevLadderLeg);
            }
            ladders.add(legs);
        }

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
}
