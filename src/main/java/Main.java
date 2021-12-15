import ladder.Ladder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명인가요?");
        int numberOfPeople = scanner.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int heightOfLadder = scanner.nextInt();
        createLadder(numberOfPeople, heightOfLadder);
    }

    private static void createLadder(int numberOfPeople, int heightOfLadder) {
        try {
            Ladder ladder = new Ladder(numberOfPeople, heightOfLadder);
            ladder.print();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
