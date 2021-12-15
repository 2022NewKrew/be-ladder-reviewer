package ladder.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {

    private final int height;
    private final int width;
    private final List<List<Boolean>> lines;

    public Ladder(int height, int width) {
        this.height = height;
        this.width = width;
        this.lines = makeLines(height, width-1);
    }

    private List<List<Boolean>> makeLines(int height, int width) {
        return IntStream
                .range(0, height)
                .mapToObj(i -> makeLine(width))
                .collect(Collectors.toList());
    }

    private List<Boolean> makeLine(int width) {
        Random random = new Random();
        return IntStream
                .range(0, width-1)
                .mapToObj(j -> random.nextBoolean())
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
        return lines.stream().map(line ->
                "|" + line.stream()
                    .map(b -> b ? "-" : " ")
                    .collect(Collectors.joining("|")) + "|")
                .collect(Collectors.joining("\n"));
    }
}
