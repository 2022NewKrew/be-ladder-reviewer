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
        for (int i = 0; i < this.heightOfLadder; i++) {
            printFloors();
        }
    }

    private void printFloors() {
        String previousStick = null;
        for (int i = 0; i < this.participants; i++) {
            printMessage(VERTICAL_STICK);
            if (isLastStick(i)) {
                break;
            }
            if (HORIZONTAL_STICK.equals(previousStick) || new Random().nextInt() % 2 == 0) {
                printMessage(EMPTY_STICK);
                previousStick = EMPTY_STICK;

            } else {
                printMessage(HORIZONTAL_STICK);
                previousStick = HORIZONTAL_STICK;
            }
        }
        printMessage("\n");
    }

    private boolean isLastStick(int i) {
        return i == this.participants - 1;
    }

    private void printMessage(String message) {
        System.out.print(message);
    }
}
