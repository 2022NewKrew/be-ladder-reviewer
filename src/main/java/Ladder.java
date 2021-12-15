import exception.InvalidHeightOfLadderException;
import exception.InvalidNumberOfPeopleException;

public class Ladder {
    public void validateNumberOfPeople(Integer numberOfPeople) {
        if (numberOfPeople == null || numberOfPeople < 2)
            throw new InvalidNumberOfPeopleException("참여할 사람 수가 올바르지 않습니다.");
    }

    public void validateHeight(Integer height) {
        if (height == null || height < 1)
            throw new InvalidHeightOfLadderException("사다리 높이가 올바르지 않습니다.");
    }
}
