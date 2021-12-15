package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readPlayerCount() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int readLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(scanner.nextLine());
    }
}
