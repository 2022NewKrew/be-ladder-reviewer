package laddergame;

import laddergame.controller.LadderGameController;

public class Runner {

    public static void main(String[] args) {
        LadderGameController controller = new LadderGameController();
        controller.start();
    }
}
