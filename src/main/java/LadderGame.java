import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LadderGame {

  private static final String INPUT_USERNAME = "참여할 사람은 몇 명인가요?";
  private static final String INPUT_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
  private static final String LINE_HORIZON = "-";
  private static final String LINE_BLANK = " ";
  private static final String LINE_VERTICAL = "|";

  private static final Scanner scanner = new Scanner(System.in);
  private static final Random random = new Random();

  public static void main(String[] args) {
    LadderGame ladderGame = new LadderGame();
    ladderGame.run();
  }

  // 실행
  public void run() {

    int userCnt = Integer.parseInt(getStandardInput(INPUT_USERNAME));
    int ladderHeight = Integer.parseInt(getStandardInput(INPUT_LADDER_HEIGHT));

    List<List<Boolean>> ladder = makeLadder(userCnt, ladderHeight);
    printLadder(ladder);

  }

  // 입력 받는 함수
  public static String getStandardInput(String message) {
    System.out.println(message);
    return scanner.nextLine();
  }

  // 사다리 구성
  private List<List<Boolean>> makeLadder(int userCnt, int ladderHeight) {
    List<List<Boolean>> ladder = new ArrayList();
    for (int h = 0; h < ladderHeight; h++) {
      ladder.add(makeLadderLine(userCnt));
    }

    return ladder;
  }

  // 사다리의 라인 구성
  private List<Boolean> makeLadderLine(int userCnt) {
    List<Boolean> line = new ArrayList<>();

    boolean horizonFlag = false;
    for (int i = 0; i < userCnt; i++) {
      horizonFlag = line.add(isHorizonFlag(i, userCnt, horizonFlag));
    }

    return line;
  }

  // horizon Flag 여부 결정
  private Boolean isHorizonFlag(int i, int userCnt, boolean nowHorizenFlag) {
    // 마지막 라인이거나 이전 flag 가 이미 horizen 이면 horizen 이 아니어야한다.
    if (i == userCnt -1 || nowHorizenFlag){
      return false;
    }
    return random.nextBoolean();
  }


  // 사다리 출력
  private void printLadder(List<List<Boolean>> ladder) {
    for (int h = 0; h < ladder.size(); h++) {
      List<Boolean> line = ladder.get(h);

      for (int i = 0; i < line.size(); i++) {
        System.out.print(LINE_VERTICAL);
        System.out.print(line.get(i) ? LINE_HORIZON : LINE_BLANK);
      }

      System.out.println();
    }
  }

}