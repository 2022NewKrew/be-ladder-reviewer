package com.kakao.ladder;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author tom.kang
 * @since 2021.12.17
 */
public class Game {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Integer users = askInt("참여할 사람은 몇명인가요?", scan);
            Integer height = askInt("최대 사다리 높이는 몇개인가요?", scan);
            System.out.println(new Game(users, height).display());
        }
    }

    public static Integer askInt(String question, Scanner scan) {
        System.out.println(question);
        return scan.nextInt();
    }

    private final List<List<Boolean>> ladder;

    public Game(final Integer users, final Integer height) {
        final Random random = new Random();
        ladder = IntStream.range(0, height).mapToObj(x -> {
            final AtomicBoolean previous = new AtomicBoolean(false);
            return IntStream.range(0, users - 1).mapToObj(y -> {
                boolean current = !previous.get() && random.nextBoolean();
                previous.set(current);
                return current;
            }).collect(Collectors.toList());
        }).collect(Collectors.toList());
    }

    public String display() {
        return ladder.stream()
                .map(ladderLines -> ladderLines.stream()
                        .map(ladderLine -> ladderLine ? "-" : " ")
                        .collect(Collectors.joining("|", "|", "|"))
                ).collect(Collectors.joining("\n"));
    }
}