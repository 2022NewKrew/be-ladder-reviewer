package com.kakao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LadderGame {
    private List<List<String>> ladder = new ArrayList<>();

    public static void main(String[] args) {
        try {
            System.out.println("참여할 사람은 몇 명인가요?");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();
            System.out.println("최대 사다리 높이는 몇 개인가요?");
            int step = sc.nextInt();

            LadderGame lg = new LadderGame();
            lg.create_ladder(user, step);
            lg.draw_ladder();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<String> create_row(int user) {
        Random random = new Random();
        List<String> row = new ArrayList<>();
        for (int i = 0; i < user - 1; i++) {
            row.add(random.nextBoolean() && row.indexOf("-") != i - 1 ? "-" : " ");
        }
        return row;
    }

    public void create_ladder(int user, int step) {
        for (int i = 0; i < step; i++) {
            this.ladder.add(this.create_row(user));
        }
    }

    public void draw_ladder() {
        for (List<String> l : this.ladder) {
            System.out.println("|" + String.join("|", l) + "|");
        }
    }
}
