package reviewer.ladder;

import java.util.Random;
import java.util.Scanner;

/**
 * @author MJ
 *
 * Step2
 *
 * 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
 * method가 한 가지 일만 하도록 최대한 작게 만들어라.
 * indent(인덴트, 들여쓰기) depth를 2단계에서 1단계로 줄여라.
 * depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
 * else를 사용하지 마라.
 * 구현 순서를 고려해 프로그래밍한다.
 * naming convention을 지키면서 프로그래밍한다.
 **/
public class LadderMain {
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
            printRow(width);
        }
    }

    private static void printRow(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print((i == width - 1) ? "|\n" : "|" + ladderShape()) ;
        }
    }

    private static String ladderShape() {
        return random.nextBoolean() ? "-" : " ";
    }

}
