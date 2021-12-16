package domain;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class LadderMachine {

    private final Integer countOfPlayer;
    private final Integer height;

    private LadderMachine(Integer countOfPlayer, Integer height) {
        this.countOfPlayer = Optional.ofNullable(countOfPlayer).orElseThrow(IllegalArgumentException::new);
        this.height = Optional.ofNullable(height).orElseThrow(IllegalArgumentException::new);
    }

    public static LadderMachine create(Integer countOfPlayer, Integer height) {
        return new LadderMachine(countOfPlayer, height);
    }

    public Ladder draw(PointGenerator pointGenerator) {
        return Stream.generate(() -> Line.create(this.countOfPlayer, pointGenerator))
                .limit(this.height)
                .collect(collectingAndThen(toList(), Ladder::create));
    }
}
