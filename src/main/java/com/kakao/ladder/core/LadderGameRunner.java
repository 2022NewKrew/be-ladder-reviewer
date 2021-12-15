package com.kakao.ladder.core;

import com.kakao.ladder.model.Ladder;
import com.kakao.ladder.ui.LadderGameView;

public class LadderGameRunner {
    private final LadderGameView view;
    private final BridgeGenerator generator;

    public LadderGameRunner(BridgeGenerator generator) {
        this(new LadderGameView(), generator);
    }

    public LadderGameRunner(LadderGameView view, BridgeGenerator generator) {
        this.view = view;
        this.generator = generator;
    }

    public void run() {
        int players = view.inputPlayers();
        int heights = view.inputHeight();
        Ladder ladder = new Ladder.Builder(players, heights)
                .from(generator)
                .build();

        view.printLadder(ladder);
    }

}
