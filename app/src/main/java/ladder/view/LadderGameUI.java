package ladder.view;

import java.util.Scanner;

public class LadderGameUI {

    private static final String HOW_MANY_PEOPLE = "참여할 사람은 몇 명인가요?";
    private static final String HOW_HIGH = "최대 사다리 높이는 몇 개인가요?";
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputPeopleSize() {
        System.out.println(HOW_MANY_PEOPLE);
        int numOfPeople;
        try {
            String input = scanner.nextLine();
            numOfPeople = Integer.parseInt(input);
        } catch (Exception e) {
            numOfPeople = 0;
        }
        return numOfPeople;
    }

    public static int inputLadderHigh() {
        System.out.println(HOW_HIGH);
        int highOfLadder;
        try {
            String input = scanner.nextLine();
            highOfLadder = Integer.parseInt(input);
        } catch (Exception e) {
            highOfLadder = 0;
        }
        return highOfLadder;
    }

    public static void outputLadder(String ladder) {
        System.out.println(ladder);
    }

}
