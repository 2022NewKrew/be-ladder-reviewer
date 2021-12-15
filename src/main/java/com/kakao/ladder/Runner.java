package com.kakao.ladder;

import com.kakao.ladder.domain.Ladder;
import com.kakao.ladder.view.InputView;
import com.kakao.ladder.view.OutputView;

public class Runner {
    public static void main(String[] args) {
        int userCount = InputView.inputUserCount();
        int height = InputView.inputMaxHeight();
        Ladder ladder = Ladder.init(userCount, height);
        OutputView.drawLadder(ladder);
    }
}
