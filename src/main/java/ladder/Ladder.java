package ladder;

import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;

import java.util.Random;

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
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ladder[i][j] = Cell.BLANK;
            }
        }
    }

    private void initVerticalLine() {
        for (int i = 0; i < numberOfPeople; i++) {
            for (int j = 0; j < height; j++) {
                ladder[i * 2][j] = Cell.VERTICAL;
            }
        }
    }

    private void initHorizontalLine() {
        for (int i = 0; i < (width - numberOfPeople); i++) {
            for (int j = 0; j < height; j++) {
                if (rand.nextBoolean())
                    ladder[i * 2 + 1][j] = Cell.HORIZONTAL;
            }
        }
    }

    public void print() {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print(ladder[i][j].toString());
            }
            System.out.println();
        }
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
