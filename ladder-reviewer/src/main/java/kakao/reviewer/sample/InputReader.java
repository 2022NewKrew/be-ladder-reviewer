package kakao.reviewer.sample;

import java.util.Scanner;

public class InputReader {

    private static final Scanner scanner = new Scanner(System.in);

    public int takeInput(String message) {
        int input;

        System.out.println(message);
        input = Integer.parseInt(scanner.nextLine());
        validateInput(input);

        return input;
    }

    private void validateInput(int input) {
        if(input <= 0) {
            throw new RuntimeException("1 이상의 정수만 입력가능합니다.");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
