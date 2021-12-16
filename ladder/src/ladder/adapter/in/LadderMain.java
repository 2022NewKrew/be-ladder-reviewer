package ladder.adapter.in;

import ladder.adapter.out.StandardOut;
import ladder.application.port.in.LadderGame;

import java.util.Scanner;

public class LadderMain {

  static Scanner scan = new Scanner(System.in);

  private static Integer getInput(String message) {
    System.out.println(message);
    int num = scan.nextInt();
    return num;
  }

  public static void main(String[] args) {

    Integer persons = getInput("참여할 사람은 몇명인가요?");
    Integer ladderHeight = getInput("최대 사다리 높이는 몇 개인가요?");

    LadderGame ladderGame = new ladder.application.port.LadderService(persons, ladderHeight);
    ladderGame.setLadderOut(new StandardOut());
    ladderGame.outLadder();
  }
}
