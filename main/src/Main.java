import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력값 받아서 처리(개선사항)
        System.out.print("사람수 : ");
        int memberNumber = scanner.nextInt();

        System.out.print("사다리높이 : ");
        int ladderHeight = scanner.nextInt();

        Ladder ladder = new Ladder(memberNumber, ladderHeight);
        ladder.printFrame();
    }
}
