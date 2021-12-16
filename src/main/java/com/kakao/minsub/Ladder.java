package com.kakao.minsub;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private List<List<Boolean>> lines;
    private Random random = new Random();
    
    public Ladder(int playerCount, int height) {
        this.lines = generateLadder(playerCount, height);
    }
    
    private List<List<Boolean>> generateLadder(int playerCount, int height) {
        return IntStream.range(0, height).mapToObj(i -> generateLines(playerCount)).collect(Collectors.toList());
    }
    
    private List<Boolean> generateLines(int playerCount) {
        List<Boolean> lines = new ArrayList<>();
        boolean preLine = false;
        for (int j=0; j<playerCount-1; j++) {
            boolean line = preLine ? false : random.nextBoolean();
            lines.add(line);
            preLine = line;
        }
        return lines;
    }
    
    public void print() {
        lines.forEach(line -> {
            line.forEach(e -> System.out.print("|" + (e ? "--" : "  ")));
            System.out.println("|  ");
        });
    }
}
