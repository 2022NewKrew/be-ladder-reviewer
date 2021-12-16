import java.util.Scanner;

public class LadderGame {
	public void start() {
		Scanner scanner = new Scanner(System.in);
		int playerNumber = askPlayerNumber(scanner);
		int height = askHeight(scanner);
		Ladder ladder = new Ladder(playerNumber, height);
		ladder.print();
		scanner.close();
	}

	private int askPlayerNumber(Scanner scanner) {
		System.out.println("참여할 사람은 몇 명인가요?");
		return scanner.nextInt();

	private int askHeight(Scanner scanner) {
		System.out.println("최대 사다리 높이는 몇 개인가요?");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		LadderGame ladderGame = new LadderGame();
		ladderGame.start();
	}
}
