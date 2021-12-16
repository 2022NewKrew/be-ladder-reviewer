package laddergame.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String INPUT_PARTICIPANT_NUMBER_MESSAGE = "참여할 사람은 몇 명인가요?";
    private static final String INPUT_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    public static int inputParticipantNumber() {
        System.out.println(INPUT_PARTICIPANT_NUMBER_MESSAGE);
        return Integer.parseInt(scanner.nextLine());
    }

    public static int inputLadderHeight() {
        System.out.println(INPUT_LADDER_HEIGHT_MESSAGE);
        return Integer.parseInt(scanner.nextLine());
    }
}
