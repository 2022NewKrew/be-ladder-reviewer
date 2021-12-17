package laddergame.domain.ladder;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderRow implements Iterable<LadderPart> {

    private final List<LadderPart> ladderLine;

    private LadderRow(List<LadderPart> ladderLine) {
        this.ladderLine = ladderLine;
    }

    public static LadderRow create(int width) {
        List<LadderPart> line = IntStream.range(0, width)
                .mapToObj((num) -> LadderPart.randomHorizontal())
                .map((horizontalPart) -> Arrays.asList(LadderPart.VERTICAL_LINE, horizontalPart))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        line.add(LadderPart.VERTICAL_LINE);

        return new LadderRow(line);
    }

    @Override
    public Iterator<LadderPart> iterator() {
        return ladderLine.iterator();
    }

    @Override
    public void forEach(Consumer<? super LadderPart> action) {
        ladderLine.forEach(action);
    }

    @Override
    public Spliterator<LadderPart> spliterator() {
        return ladderLine.spliterator();
    }
}
