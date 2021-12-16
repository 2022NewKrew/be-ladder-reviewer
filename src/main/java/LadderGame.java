import java.util.Random;
import java.util.Scanner;

public class LadderGame {

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
            for (int j = 0; j < this.participants; j++) {
                printMessage("|");
                if (j == this.participants - 1) {
                    break;
                }
                if (new Random().nextInt() % 2 == 0) {
                    printMessage(" ");
                } else {
                    printMessage("-");
                }
            }
            printMessage("\n");
        }
    }

    private void printMessage(String message) {
        System.out.print(message);
    }
}
