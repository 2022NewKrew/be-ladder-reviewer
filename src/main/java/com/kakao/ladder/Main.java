package com.kakao.ladder;

import com.kakao.ladder.core.LadderGameRunner;
import com.kakao.ladder.util.BridgeGenerators;

public class Main {
    public static void main(String[] args) {
        LadderGameRunner runner = new LadderGameRunner(
                BridgeGenerators.random()
        );
        runner.run();
    }
}
