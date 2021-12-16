package kakao.reviewer.sample;

import java.util.Random;

public class LadderBuilder {

    private final int width;
    private final int height;
    private static final Random rand = new Random();

    public LadderBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean[][] buildLadder() {
        boolean[][] ladder = new boolean[height][width];

        for(int i = 0; i < height; i++) {
            buildRandomBridgeForStep(ladder, i);
        }
        return ladder;
    }

    private void buildRandomBridgeForStep(boolean[][] ladder, int step) {
        for(int j = 0; j < width - 1; j++) {
            ladder[step][j] = rand.nextBoolean();
        }
    }

    public void printLadder(boolean[][] ladder) {
        for(int i = 0; i < height; i++) {
            printLadderStep(ladder, i);
            System.out.println();
        }
    }

    private void printLadderStep(boolean[][] ladder, int step) {
        for(int j = 0; j < width; j++) {
            System.out.print("|");

            String bridge = getBridge(ladder[step][j]);
            System.out.print(bridge);
        }
    }

    private String getBridge(boolean isBridge) {
        if(isBridge) {
            return "-";
        }
        return " ";
    }

}
