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

        System.out.println("참여할 사람은 몇 명인가요?");
        this.participants = scanner.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        this.heightOfLadder = scanner.nextInt();
    }

    private void printLadders() {
    }
}
