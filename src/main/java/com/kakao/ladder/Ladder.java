package com.kakao.ladder;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * @author tom.kang
 * @since 2021.12.17
 */
public class Ladder {
    /**
     * 사다리의 가로 라인이 존재하는지 여부
     * m(users) x n(height)의 사다리는 m-1 x n 개의 원소를 가진다.
     */
    private final List<List<Boolean>> ladderLines;

    public Ladder(final Integer users, final Integer height) {
        ladderLines = IntStream.range(0, height).mapToObj(x -> generateRow(users - 1)).collect(Collectors.toList());
    }

    public String display() {
        return ladderLines.stream().map(Ladder::displayRow).collect(Collectors.joining("\n"));
    }

    public static List<Boolean> generateRow(Integer count) {
        final Random random = new Random();
        final AtomicBoolean previous = new AtomicBoolean(false);
        return IntStream.range(0, count).mapToObj(x -> {
            boolean current = !previous.get() && random.nextBoolean();
            previous.set(current);
            return current;
        }).collect(Collectors.toList());
    }

    public static String displayRow(List<Boolean> row) {
        return row.stream()
                .map(hasBar -> hasBar ? "-" : " ")
                .collect(Collectors.joining("|", "|", "|"));
    }
}
