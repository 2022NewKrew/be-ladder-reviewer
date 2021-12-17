package laddergame.domain.ladder;

import java.util.Random;

public enum LadderPart {

    VERTICAL_LINE("|"),
    HORIZONTAL_LINE("-"),
    HORIZONTAL_EMPTY(" ");

    private static final Random random = new Random();

    private String value;

    LadderPart(String value) {
        this.value = value;
    }


    public static LadderPart randomHorizontal() {
        if(random.nextBoolean()) {
            return HORIZONTAL_LINE;
        }

        return HORIZONTAL_EMPTY;
    }

    @Override
    public String toString() {
        return value;
    }

}
