import java.util.Scanner;

public class LadderGameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int userCount = scanner.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = scanner.nextInt();

        LadderGame ladderGame = new LadderGame(userCount, ladderHeight);
        ladderGame.printLadder();
    }
}
