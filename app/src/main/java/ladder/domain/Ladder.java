package ladder.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {

    private final List<LadderLine> lines;
    private final int width;

    public Ladder(int height, int width) {
        validationCheck(height, width);
        this.width = width;
        lines = IntStream
                .range(0, height)
                .mapToObj(j -> new LadderLine(width))
                .collect(Collectors.toList());
    }

    private void validationCheck(int height, int width) {
        if (height < 1 || width < 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getHeight() {
        return lines.size();
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return lines.stream()
                .map(LadderLine::toString)
                .collect(Collectors.joining("\n"));
    }
}
