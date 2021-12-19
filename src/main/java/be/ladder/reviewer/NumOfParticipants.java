package be.ladder.reviewer;

public class NumOfParticipants {
    private final int value;

    public NumOfParticipants(int value) {
        if(value <= 1) {
            throw new IllegalArgumentException("NumOfParticipants must be greater than 1");
        }

        this.value = value;
    }

    public int numOfLinesInLadderEntry() {
        return value - 1;
    }
}
