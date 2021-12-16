package laddergame.domain.ladder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static laddergame.domain.ladder.LadderComponent.RandomHorizontalComponent;
import static laddergame.domain.ladder.LadderComponent.VERTICAL_BAR;

public class LadderLayer {
    private final List<LadderComponent> ladderLayer;

    public LadderLayer(int participantNumber) {
        int maxComponentNumber = participantNumber * 2 - 1;
        this.ladderLayer = IntStream.
                range(0, maxComponentNumber).
                mapToObj(this::newLadderComponent).
                collect(Collectors.toList());
    }

    private LadderComponent newLadderComponent(int componentNumber) {
        if (componentNumber % 2 == 0) {
            return VERTICAL_BAR;
        }
        return RandomHorizontalComponent();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (LadderComponent component : this.ladderLayer) {
            result.append(component.getShape());
        }
        return result.toString();
    }
}
