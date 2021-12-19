package be.ladder.reviewer;

public class Height {
    private final int value;

    public Height(int value) {
        if(value <= 0) {
            throw new IllegalArgumentException("NumOfParticipants must be positive");
        }

        this.value = value;
    }

    public int value() {
        return value;
    }
}
