package com.kakao.reviewer;

import java.util.Random;
import java.util.Scanner;

public class Ladder {

    private static Random random = new Random();
    private static String STEP = "-";
    private static String BLANK = " ";

    private static void makeLadder(int numberOfUsers, int heightOfLadder){
        String[][] ladder = new String[heightOfLadder][numberOfUsers-1];
        for(String[] steps:ladder) {
            for(int i = 0; i< steps.length; i++) {
                steps[i] = (random.nextInt(2) == 0) ? BLANK : STEP;
                if (i > 0 && steps[i].equals(STEP) && steps[i-1].equals(STEP))
                    steps[i] = BLANK;
            }
        }
        printLadder(ladder);
    }

    private static void printLadder(String[][] ladder) {
        StringBuilder sb = new StringBuilder();
        for(String[] steps : ladder){
            sb.append("|");
            for(String step : steps) {
                sb.append(step).append("|");
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }


    public static void main(String[] args) {
        Scanner inputNumberOfUsers = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명인가요?");
        String numberOfUsers = inputNumberOfUsers.nextLine();
        System.out.println(numberOfUsers);

        Scanner inputHeightOfLadder = new Scanner(System.in);
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String heightOfLadder = inputHeightOfLadder.nextLine();
        System.out.println(heightOfLadder);

        makeLadder(Integer.parseInt(numberOfUsers), Integer.parseInt(heightOfLadder));
    }

}
