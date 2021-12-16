package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LadderLine {

    private final List<Boolean> line;

    public LadderLine(int width) {
        Random random = new Random();
        line = new ArrayList<>();
        for (int i = 0; i < width - 1; i++) {
            Boolean stick = makeStick(i, random);
            line.add(stick);
        }
    }

    private Boolean makeStick(int index, Random random) {
        if (index > 0 && line.get(index-1)) {
            return false;
        }
        return random.nextBoolean();
    }

    @Override
    public String toString() {
        return "|" + line
                .stream()
                .map(b -> b ? "-" : " " )
                .collect(Collectors.joining("|")) + "|";
    }

}
