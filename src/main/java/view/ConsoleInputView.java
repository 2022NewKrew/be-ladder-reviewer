package view;

import java.util.Scanner;

public class ConsoleInputView implements InputView {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public int getNumberOfParticipants() {
        System.out.println("Enter The Number Of Participants: ");

        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine();

        return numberOfParticipants;
    }

    @Override
    public int getHeightOfLadder() {
        System.out.println("How Much Is The Height Of Ladder?");

        int height =  scanner.nextInt();
        scanner.nextLine();

        return height;
    }
}
