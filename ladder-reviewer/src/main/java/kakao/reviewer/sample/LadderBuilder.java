package kakao.reviewer.sample;

import java.util.Random;

public class LadderBuilder {

    private final int width;
    private final int height;

    public LadderBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean[][] buildLadder() {
        Random rand = new Random();
        boolean[][] ladder = new boolean[height][width];

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width - 1; j++) {
                ladder[i][j] = rand.nextBoolean();
            }
        }
        return ladder;
    }

    public void printLadder(boolean[][] ladder) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("|");
                printBridge(ladder[i][j]);
            }
            System.out.println();
        }
    }

    private void printBridge(boolean isBridge) {
        if(isBridge) {
            System.out.print("-");
        } else {
            System.out.print(" ");
        }
    }

}
