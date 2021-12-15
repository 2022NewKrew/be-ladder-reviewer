package view;

import java.util.Scanner;

public class InputView {
    private static final String MSG_INPUT_USER_COUNT = "참여할 사람은 몇 명인가요?";
    private static final String MSG_INPUT_LADDER_HEIGHT = "참여할 사람은 몇 명인가요?";

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputUserCount() {
        System.out.println(MSG_INPUT_USER_COUNT);
        return scanner.nextInt();
    }

    public static int inputLadderHeight() {
        System.out.println(MSG_INPUT_LADDER_HEIGHT);
        return scanner.nextInt();
    }
}
