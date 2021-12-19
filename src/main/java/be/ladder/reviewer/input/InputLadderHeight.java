package be.ladder.reviewer.input;

import be.ladder.reviewer.Height;

import java.util.Scanner;

public class InputLadderHeight {
    public Height value() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        Scanner scanner = new Scanner(System.in);
        return new Height(scanner.nextInt());
    }
}
