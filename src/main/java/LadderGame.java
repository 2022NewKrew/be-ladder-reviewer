import java.util.Random;
import java.util.Scanner;

public class LadderGame {

    private static final String HORIZONTAL_STICK = "-";
    private static final String VERTICAL_STICK = "|";
    private static final String EMPTY_STICK = " ";

    private int participants;
    private int heightOfLadder;

    public void start() {
        readRequiredInputs();
        printLadders();
    }

    private void readRequiredInputs() {
        Scanner scanner = new Scanner(System.in);

        printMessage("참여할 사람은 몇 명인가요?\n");
        this.participants = scanner.nextInt();

        printMessage("최대 사다리 높이는 몇 개인가요?\n");
        this.heightOfLadder = scanner.nextInt();
    }

    private void printLadders() {
        printNewLine();
        for (int i = 0; i < this.heightOfLadder; i++) {
            printFloors();
        }
        printNewLine();
    }

    private void printFloors() {
        printMessage(VERTICAL_STICK);
        String previousStick = null;
        for (int i = 0; i < this.participants - 1; i++) {
            previousStick = getNextStick(previousStick);
            printMessage(previousStick);
            printMessage(VERTICAL_STICK);
        }
        printNewLine();
    }

    private String getNextStick(String previousStick) {
        if (HORIZONTAL_STICK.equals(previousStick) || new Random().nextInt() % 2 == 0) {
            return EMPTY_STICK;
        }
        return HORIZONTAL_STICK;
    }

    private void printNewLine() {
        printMessage("\n");
    }

    private void printMessage(String message) {
        System.out.print(message);
    }
}
