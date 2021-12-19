package be.ladder.reviewer.input;

import be.ladder.reviewer.NumOfParticipants;

import java.util.Scanner;

public class InputNumOfParticipants {
    public NumOfParticipants value() {
        System.out.println("참여할 사람은 몇 명인가요?");
        Scanner scanner = new Scanner(System.in);
        return new NumOfParticipants(scanner.nextInt());
    }
}
