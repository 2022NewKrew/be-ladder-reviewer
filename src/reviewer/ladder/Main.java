package reviewer.ladder;

import java.util.Random;
import java.util.Scanner;

/**
 * @author MJ
 * 간단한 사다리 게임을 구현한다.
 * n명의 사람과 m개의 사다리 개수를 입력할 수 있어야 한다.
 * 사다리의 라인은 랜덤 값에 따라 있거나 없을 수도 있다.
 * 사다리가 있으면 -를 표시하고 없으면 " " 빈공백을 표시한다. 양옆에는 |로 세로를 표시한다.
 * 사다리 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
 * <p>
 * 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
 * method가 한 가지 일만 하도록 최대한 작게 만들자.
 * <p>
 * 2차원 배열을 학습한 후 2차원 배열을 추가해 문제를 해결하거나 ArrayList를 학습하고 이를 이용해 구현한다.
 *
 * 참여할 사람은 몇 명인가요?
 * 3
 * 최대 사다리 높이는 몇 개인가요?
 * 5
 *
 * |-| |
 * | |-|
 * |-| |
 * | |-|
 * |-| |
 **/
public class Main {
    private static final Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명인가요? ");
        int width = in.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요? ");
        int height = in.nextInt();

        printLadder(width, height);
    }

    private static void printLadder(int width, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if (i == width - 1)
                    System.out.println("|");
                else
                    System.out.print("|" + ladderShape());
            }
        }
    }

    private static String ladderShape() {
        return random.nextBoolean() ? "-" : " ";
    }
}
