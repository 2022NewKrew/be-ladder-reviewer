package com.kakao.reviewer;

import com.kakao.reviewer.domain.Ladder;
import com.kakao.reviewer.view.InputView;
import com.kakao.reviewer.view.ResultView;

public class LadderGame {
    public static void main(String[] args) {
        int memberSize = InputView.scanMemberSize();
        int height = InputView.scanHeight();
        Ladder ladder = new Ladder(memberSize, height).build();
        ResultView.print(ladder);
    }
}
