package be.ladder.reviewer.input;

import java.util.Scanner;

public class InputLadderHeight {
    public int value() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
