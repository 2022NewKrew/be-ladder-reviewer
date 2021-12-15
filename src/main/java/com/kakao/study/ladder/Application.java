package com.kakao.study.ladder;

import com.kakao.study.ladder.view.InputView;
import com.kakao.study.ladder.view.OutputView;

public class Application {
    public static void main(String[] args) {

        InputView inputView = new InputView();

        int countOfPlayer = inputView.inputCountOfPlayer();
        int heightOfLadder = inputView.inputHeightOfLadder();

        Controller controller = new Controller();
        Ladder ladder = controller.generateLadder(countOfPlayer, heightOfLadder);

        OutputView outputView = new OutputView();
        outputView.printLadder(ladder, countOfPlayer, heightOfLadder);
    }
}
