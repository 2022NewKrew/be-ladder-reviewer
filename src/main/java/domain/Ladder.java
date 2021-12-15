package domain;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class Ladder {

    private final Lines lines;

    private Ladder(Integer count, Integer height) {
        if (count == null || height == null) {
            throw new IllegalArgumentException();
        }

        lines = Stream.generate(() -> Line.create(count, new RandomPointGenerator()))
                .limit(height)
                .collect(collectingAndThen(toList(), Lines::create));
    }

    public static Ladder create(Integer count, Integer height) {
        return new Ladder(count, height);
    }

    public Lines getLines() {
        return lines;
    }
}
