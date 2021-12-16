package laddergame.domain.ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private final List<LadderLayer> ladder;

    public Ladder(int participantNumber, int ladderHeight) {
        this.ladder = IntStream.
                range(0, ladderHeight).
                mapToObj(i -> new LadderLayer(participantNumber)).
                collect(Collectors.toList());
    }

    public List<String> toStringList() {
        List<String> result = new ArrayList<>();
        for (LadderLayer layer : this.ladder) {
            result.add(layer.toString());
        }
        return result;
    }
}
