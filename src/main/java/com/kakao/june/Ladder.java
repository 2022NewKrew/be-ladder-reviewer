package com.kakao.june;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 사다리
 * 최대 높이 (maxHeight) 만큼의 rows로 구성된다.
 * 각 row는 발판(rung)들로 구성된다.
 */
public class Ladder {
    private final List<List<Boolean>> rows = new ArrayList<>();
    private final Random random = new Random();

    public Ladder(int userNumber, int maxHeight) {
        for (int i = 0; i < maxHeight; i++) {
            rows.add(createRungs(userNumber));
        }
    }

    public void printLadder() {
        for (List<Boolean> rungs : rows) {
            printRow(rungs);
        }
    }

    private void printRow(List<Boolean> rungs) {
        for (Boolean rung : rungs) {
            System.out.print("|");
            if (Boolean.TRUE.equals(rung)) {
                System.out.print("-");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("|");
    }

    private List<Boolean> createRungs(int userNumber) {
        List<Boolean> rungs = new ArrayList<>();

        for (int i = 0; i < userNumber - 1; i++) {
            rungs.add(random.nextBoolean());
        }
        return rungs;
    }
}
