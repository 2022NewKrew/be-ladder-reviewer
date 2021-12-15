package ladder;

import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;

import java.util.Random;
import java.util.stream.IntStream;

public class Ladder {
    private final Random rand = new Random();
    private final Cell[][] ladder;
    private final int width;
    private final int height;
    private final int numberOfPeople;

    public Ladder(int numberOfPeople, int height) {
        validateInput(numberOfPeople, height);
        this.numberOfPeople = numberOfPeople;
        this.width = numberOfPeople * 2 - 1;
        this.height = height;
        this.ladder = new Cell[width][height];
        fillLadder();
    }

    private void fillLadder() {
        initBlank();
        initVerticalLine();
        initHorizontalLine();
    }

    private void initBlank() {
        IntStream.range(0, width)
                .forEach(x -> fillYAxis(x, Cell.BLANK));
    }

    private void initVerticalLine() {
        IntStream.range(0, numberOfPeople)
                .forEach(x -> fillYAxis(x * 2, Cell.VERTICAL));
    }

    private void fillYAxis(int x, Cell cell) {
        IntStream.range(0, height)
                .forEach(y -> ladder[x][y] = cell);
    }

    private void initHorizontalLine() {
        for (int x = 0; x < (width - numberOfPeople); x++) {
            fillYAxisWithHorizontalLine(x * 2 + 1);
        }
    }

    private void fillYAxisWithHorizontalLine(int x) {
        IntStream.range(0, height)
                .filter(value -> rand.nextBoolean())
                .forEach(y -> ladder[x][y] = Cell.HORIZONTAL);
    }

    public void print() {
        IntStream.range(0, height)
                .forEach(y -> {
                    IntStream.range(0, width)
                            .forEach(x -> System.out.print(ladder[x][y].toString()));
                    System.out.println();
                });
    }

    private void validateInput(int numberOfPeople, int height) {
        validateNumberOfPeople(numberOfPeople);
        validateHeight(height);
    }

    private void validateNumberOfPeople(Integer numberOfPeople) {
        if (numberOfPeople == null || numberOfPeople < 2)
            throw new InvalidNumberOfPeopleException(() ->
                    String.format("참여할 사람 수가 올바르지 않습니다. 입력된 사람 수: %d", numberOfPeople));
    }

    private void validateHeight(Integer height) {
        if (height == null || height < 1)
            throw new InvalidHeightOfLadderException(() ->
                    String.format("사다리 높이가 올바르지 않습니다. 입력된 사다리 높이: %d", height));
    }
}
