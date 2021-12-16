package kakao.reviewer.sample;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            int[] input = takeInput();

            LadderBuilder ladderBuilder = new LadderBuilder(input[0], input[1]);
            boolean[][] ladder = ladderBuilder.buildLadder();
            ladderBuilder.printLadder(ladder);
        } catch (Exception e) {
            System.out.println("[FAILED] 잘못된 입력입니다: " + e.getMessage());
        }
    }

    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람은 몇 명인가요?");
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        validateInput(numOfPeople);

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = Integer.parseInt(scanner.nextLine());
        validateInput(ladderHeight);

        scanner.close();
        return new int[] {numOfPeople, ladderHeight};
    }

    public static void validateInput(int input) {
        if(input <= 0) {
            throw new RuntimeException("1 이상의 정수만 입력가능합니다.");
        }
    }
}
