import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;

import java.util.Random;

public class Ladder {
    private final Random rand = new Random();
    private final int[][] ladder;
    private final int width;
    private final int height;
    private final int numberOfPeople;

    public Ladder(int numberOfPeople, int height) {
        validateInput(numberOfPeople, height);
        this.numberOfPeople = numberOfPeople;
        this.width = numberOfPeople * 2 - 1;
        this.height = height;
        this.ladder = new int[width][height];
    }

    public void validateInput(int numberOfPeople, int height) {
        validateNumberOfPeople(numberOfPeople);
        validateHeight(height);
    }

    public void validateNumberOfPeople(Integer numberOfPeople) {
        if (numberOfPeople == null || numberOfPeople < 2)
            throw new InvalidNumberOfPeopleException(() ->
                    String.format("참여할 사람 수가 올바르지 않습니다. 입력된 사람 수: %d", numberOfPeople));
    }

    public void validateHeight(Integer height) {
        if (height == null || height < 1)
            throw new InvalidHeightOfLadderException(() ->
                    String.format("사다리 높이가 올바르지 않습니다. 입력된 사다리 높이: %d", height));
    }
}
