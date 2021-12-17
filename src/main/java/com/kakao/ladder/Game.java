package com.kakao.ladder;

import java.util.Scanner;

/**
 * @author tom.kang
 * @since 2021.12.17
 */
public class Game {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Integer users = askInt("참여할 사람은 몇명인가요?", scan);
            Integer height = askInt("최대 사다리 높이는 몇개인가요?", scan);
            System.out.println(new Ladder(users, height).display());
        }
    }

    public static Integer askInt(String question, Scanner scan) {
        System.out.println(question);
        return scan.nextInt();
    }
}