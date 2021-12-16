import component.Ladder;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static int getPeopleNumFromConsole() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return sc.nextInt();
    }

    public static int getHeightFromConsole() {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int col = getPeopleNumFromConsole();
        int row = getHeightFromConsole();

        Ladder ladder = new Ladder(row, col);
        ladder.createAllLineByRandom();
        ladder.printLadder();
    }
}
