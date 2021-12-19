package be.ladder.reviewer.input;

import java.util.Scanner;

public class InputNumOfParticipants {
    public int value() {
        System.out.println("참여할 사람은 몇 명인가요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
