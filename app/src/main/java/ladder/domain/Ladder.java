package ladder.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {

    private final int height;
    private final int width;
    private final List<LadderLine> lines;

    public Ladder(int height, int width) {
        this.height = height;
        this.width = width;
        lines = IntStream
                .range(0, height)
                .mapToObj(j -> new LadderLine(width))
                .collect(Collectors.toList());
    }

    public int getHeight() {
        return height;
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
