package com.kakao.controller;

import com.kakao.domain.HeadCount;
import com.kakao.domain.Height;
import com.kakao.domain.Ladder;
import com.kakao.domain.LadderFactory;
import com.kakao.view.InputView;
import com.kakao.view.OutputView;
import com.kakao.view.dto.LadderDto;

public final class LadderController {

    private LadderController() {}

    public static void run() {
        HeadCount headCount = new HeadCount(InputView.getHeadCount());
        Height height = new Height(InputView.getHeight());

        Ladder ladder = LadderFactory.create(headCount, height);

        OutputView.printLadder(LadderDto.of(ladder));
    }
}
