package be.ladder.reviewer;

import be.ladder.reviewer.input.InputLadderHeight;
import be.ladder.reviewer.input.InputNumOfParticipants;
import be.ladder.reviewer.output.PrintLadder;

import java.util.Random;

public class LadderGame {
    private final InputLadderHeight inputLadderHeight;
    private final InputNumOfParticipants inputNumOfParticipants;
    private final RandomLadder randomLadder;
    private final PrintLadder printLadder;

    public LadderGame(InputLadderHeight inputLadderHeight, InputNumOfParticipants inputNumOfParticipants, RandomLadder randomLadder, PrintLadder printLadder) {
        this.inputLadderHeight = inputLadderHeight;
        this.inputNumOfParticipants = inputNumOfParticipants;
        this.randomLadder = randomLadder;
        this.printLadder = printLadder;
    }

    void start() {
        int numOfParticipants = inputNumOfParticipants.value();
        int height = inputLadderHeight.value();

        Ladder ladder = randomLadder.build(numOfParticipants, height);

        printLadder.print(ladder);
    }

    public static void main(String[] args) {
        new LadderGame(
                new InputLadderHeight(),
                new InputNumOfParticipants(),
                new RandomLadder(new Random()),
                new PrintLadder()
        ).start();
    }
}
