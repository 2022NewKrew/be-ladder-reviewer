package com.kakao.minsub;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명인가요?");
        int playerCount = scanner.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = scanner.nextInt();
        
        printLadder(generateLadder(playerCount, ladderHeight));
    }
    
    private static List<List<Boolean>> generateLadder(int playerCount, int height) {
        final Random random = new Random();
        return IntStream.range(0, height).mapToObj(i -> {
            List<Boolean> lines = new ArrayList<>();
            boolean preLine = false;
            for (int j=0; j<playerCount-1; j++) {
                boolean line = preLine ? false : random.nextBoolean();
                lines.add(line);
                preLine = line;
            }
            return lines;
        }).collect(Collectors.toList());
    }
    
    private static void printLadder(List<List<Boolean>> ladder) {
        ladder.forEach(line -> {
            line.forEach(e -> System.out.print("|" + (e ? "--" : "  ")));
            System.out.println("|  ");
        });
    }
}
