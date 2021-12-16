package kakao.reviewer.sample;

public class Main {
    public static void main(String[] args) {
        try {
            InputReader inputReader = new InputReader();
            int numOfPeople = inputReader.takeInput("참여할 사람은 몇 명인가요?");
            int ladderHeight = inputReader.takeInput("최대 사다리 높이는 몇 개인가요?");
            inputReader.closeScanner();

            buildLadder(numOfPeople, ladderHeight);
        } catch (Exception e) {
            System.out.println("[FAILED] " + e.getMessage());
        }
    }

    public static void buildLadder(int numOfPeople, int ladderHeight) {
        LadderBuilder ladderBuilder = new LadderBuilder(numOfPeople, ladderHeight);
        boolean[][] ladder = ladderBuilder.buildLadder();
        ladderBuilder.printLadder(ladder);
    }
}
