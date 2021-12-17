package laddergame.view;

import laddergame.domain.player.Players;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class InputView implements Closeable {

    private static final String PARTICIPANT_INPUT_PROMPT_MESSAGE = "참여할 사람은 몇 명인가요?";
    private static final String LADDER_HEIGHT_INPUT_PROMPT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    private static final String CAR_NAMES_DELIMITER = ",";

    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    private void printParticipantInputPromptMessage() {
        System.out.println(PARTICIPANT_INPUT_PROMPT_MESSAGE);
    }

    private void printLadderHeightInputPromptMessage() {
        System.out.println(LADDER_HEIGHT_INPUT_PROMPT_MESSAGE);
    }

    private int nextInt() {
        return scanner.nextInt();
    }

    public Players inputParticipantsCount() {
        printParticipantInputPromptMessage();
        int count = nextInt();

        return new Players(count);
    }

    public int inputLadderHeight() {
        printLadderHeightInputPromptMessage();
        return nextInt();
    }

    @Override
    public void close() throws IOException {
        scanner.close();
    }

}